
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abonado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abonado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abNif" type="{http://ws/}persona" minOccurs="0"/>
 *         &lt;element name="abPasswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abonado", propOrder = {
    "abLogin",
    "abNif",
    "abPasswd"
})
public class Abonado {

    protected String abLogin;
    protected Persona abNif;
    protected String abPasswd;

    /**
     * Obtiene el valor de la propiedad abLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbLogin() {
        return abLogin;
    }

    /**
     * Define el valor de la propiedad abLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbLogin(String value) {
        this.abLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad abNif.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getAbNif() {
        return abNif;
    }

    /**
     * Define el valor de la propiedad abNif.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setAbNif(Persona value) {
        this.abNif = value;
    }

    /**
     * Obtiene el valor de la propiedad abPasswd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbPasswd() {
        return abPasswd;
    }

    /**
     * Define el valor de la propiedad abPasswd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbPasswd(String value) {
        this.abPasswd = value;
    }

}
