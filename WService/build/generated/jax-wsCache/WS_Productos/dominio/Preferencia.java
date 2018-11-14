
package dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://dominio/}categoria" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iddenominacion" type="{http://dominio/}denominacionOrigen" minOccurs="0"/>
 *         &lt;element name="nifabonado" type="{http://dominio/}abonado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferencia", propOrder = {
    "categoria",
    "id",
    "iddenominacion",
    "nifabonado"
})
public class Preferencia {

    protected Categoria categoria;
    protected Integer id;
    protected DenominacionOrigen iddenominacion;
    protected Abonado nifabonado;

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
     * Obtiene el valor de la propiedad nifabonado.
     * 
     * @return
     *     possible object is
     *     {@link Abonado }
     *     
     */
    public Abonado getNifabonado() {
        return nifabonado;
    }

    /**
     * Define el valor de la propiedad nifabonado.
     * 
     * @param value
     *     allowed object is
     *     {@link Abonado }
     *     
     */
    public void setNifabonado(Abonado value) {
        this.nifabonado = value;
    }

}
