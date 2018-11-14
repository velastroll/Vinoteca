
package dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vino complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://dominio/}categoria" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idbodega" type="{http://dominio/}bodega" minOccurs="0"/>
 *         &lt;element name="iddenominacion" type="{http://dominio/}denominacionOrigen" minOccurs="0"/>
 *         &lt;element name="nombrecomercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vino", propOrder = {
    "categoria",
    "comentario",
    "id",
    "idbodega",
    "iddenominacion",
    "nombrecomercial"
})
public class Vino {

    protected Categoria categoria;
    protected String comentario;
    protected Integer id;
    protected Bodega idbodega;
    protected DenominacionOrigen iddenominacion;
    protected String nombrecomercial;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idbodega.
     * 
     * @return
     *     possible object is
     *     {@link Bodega }
     *     
     */
    public Bodega getIdbodega() {
        return idbodega;
    }

    /**
     * Define el valor de la propiedad idbodega.
     * 
     * @param value
     *     allowed object is
     *     {@link Bodega }
     *     
     */
    public void setIdbodega(Bodega value) {
        this.idbodega = value;
    }

    /**
     * Obtiene el valor de la propiedad iddenominacion.
     * 
     * @return
     *     possible object is
     *     {@link DenominacionOrigen }
     *     
     */
    public DenominacionOrigen getIddenominacion() {
        return iddenominacion;
    }

    /**
     * Define el valor de la propiedad iddenominacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DenominacionOrigen }
     *     
     */
    public void setIddenominacion(DenominacionOrigen value) {
        this.iddenominacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecomercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecomercial() {
        return nombrecomercial;
    }

    /**
     * Define el valor de la propiedad nombrecomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecomercial(String value) {
        this.nombrecomercial = value;
    }

}
