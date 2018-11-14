
package dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="peEstado" type="{http://dominio/}estadoPedido" minOccurs="0"/>
 *         &lt;element name="peId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="peNif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedido", propOrder = {
    "fecha",
    "importe",
    "peEstado",
    "peId",
    "peNif",
    "peReferencia"
})
public class Pedido {

    protected String fecha;
    protected Float importe;
    protected EstadoPedido peEstado;
    protected Integer peId;
    protected String peNif;
    protected int peReferencia;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImporte(Float value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad peEstado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoPedido }
     *     
     */
    public EstadoPedido getPeEstado() {
        return peEstado;
    }

    /**
     * Define el valor de la propiedad peEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoPedido }
     *     
     */
    public void setPeEstado(EstadoPedido value) {
        this.peEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad peId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeId() {
        return peId;
    }

    /**
     * Define el valor de la propiedad peId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeId(Integer value) {
        this.peId = value;
    }

    /**
     * Obtiene el valor de la propiedad peNif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeNif() {
        return peNif;
    }

    /**
     * Define el valor de la propiedad peNif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeNif(String value) {
        this.peNif = value;
    }

    /**
     * Obtiene el valor de la propiedad peReferencia.
     * 
     */
    public int getPeReferencia() {
        return peReferencia;
    }

    /**
     * Define el valor de la propiedad peReferencia.
     * 
     */
    public void setPeReferencia(int value) {
        this.peReferencia = value;
    }

}
