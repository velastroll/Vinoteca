
package dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para referencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="referencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="esporcajas" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="vinoid" type="{http://dominio/}vino" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referencia", propOrder = {
    "codigo",
    "contenido",
    "esporcajas",
    "precio",
    "vinoid"
})
public class Referencia {

    protected Integer codigo;
    protected Short contenido;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer esporcajas;
    protected Float precio;
    protected Vino vinoid;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContenido(Short value) {
        this.contenido = value;
    }

    /**
     * Obtiene el valor de la propiedad esporcajas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsporcajas() {
        return esporcajas;
    }

    /**
     * Define el valor de la propiedad esporcajas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsporcajas(Integer value) {
        this.esporcajas = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecio(Float value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad vinoid.
     * 
     * @return
     *     possible object is
     *     {@link Vino }
     *     
     */
    public Vino getVinoid() {
        return vinoid;
    }

    /**
     * Define el valor de la propiedad vinoid.
     * 
     * @param value
     *     allowed object is
     *     {@link Vino }
     *     
     */
    public void setVinoid(Vino value) {
        this.vinoid = value;
    }

}
