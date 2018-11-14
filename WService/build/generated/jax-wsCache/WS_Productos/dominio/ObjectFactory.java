
package dominio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dominio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Bodega_QNAME = new QName("http://dominio/", "bodega");
    private final static QName _Abonado_QNAME = new QName("http://dominio/", "abonado");
    private final static QName _DenominacionOrigen_QNAME = new QName("http://dominio/", "denominacionOrigen");
    private final static QName _Categoria_QNAME = new QName("http://dominio/", "categoria");
    private final static QName _GetVinosResponse_QNAME = new QName("http://dominio/", "getVinosResponse");
    private final static QName _GetVinos_QNAME = new QName("http://dominio/", "getVinos");
    private final static QName _Persona_QNAME = new QName("http://dominio/", "persona");
    private final static QName _Vino_QNAME = new QName("http://dominio/", "vino");
    private final static QName _GetPreferenciasResponse_QNAME = new QName("http://dominio/", "getPreferenciasResponse");
    private final static QName _Referencia_QNAME = new QName("http://dominio/", "referencia");
    private final static QName _Preferencia_QNAME = new QName("http://dominio/", "preferencia");
    private final static QName _GetReferencias_QNAME = new QName("http://dominio/", "getReferencias");
    private final static QName _GetPreferencias_QNAME = new QName("http://dominio/", "getPreferencias");
    private final static QName _GetReferenciasResponse_QNAME = new QName("http://dominio/", "getReferenciasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dominio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPreferenciasResponse }
     * 
     */
    public GetPreferenciasResponse createGetPreferenciasResponse() {
        return new GetPreferenciasResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Vino }
     * 
     */
    public Vino createVino() {
        return new Vino();
    }

    /**
     * Create an instance of {@link GetVinos }
     * 
     */
    public GetVinos createGetVinos() {
        return new GetVinos();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link GetVinosResponse }
     * 
     */
    public GetVinosResponse createGetVinosResponse() {
        return new GetVinosResponse();
    }

    /**
     * Create an instance of {@link DenominacionOrigen }
     * 
     */
    public DenominacionOrigen createDenominacionOrigen() {
        return new DenominacionOrigen();
    }

    /**
     * Create an instance of {@link Abonado }
     * 
     */
    public Abonado createAbonado() {
        return new Abonado();
    }

    /**
     * Create an instance of {@link Bodega }
     * 
     */
    public Bodega createBodega() {
        return new Bodega();
    }

    /**
     * Create an instance of {@link GetReferenciasResponse }
     * 
     */
    public GetReferenciasResponse createGetReferenciasResponse() {
        return new GetReferenciasResponse();
    }

    /**
     * Create an instance of {@link GetPreferencias }
     * 
     */
    public GetPreferencias createGetPreferencias() {
        return new GetPreferencias();
    }

    /**
     * Create an instance of {@link GetReferencias }
     * 
     */
    public GetReferencias createGetReferencias() {
        return new GetReferencias();
    }

    /**
     * Create an instance of {@link Preferencia }
     * 
     */
    public Preferencia createPreferencia() {
        return new Preferencia();
    }

    /**
     * Create an instance of {@link Referencia }
     * 
     */
    public Referencia createReferencia() {
        return new Referencia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bodega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "bodega")
    public JAXBElement<Bodega> createBodega(Bodega value) {
        return new JAXBElement<Bodega>(_Bodega_QNAME, Bodega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Abonado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "abonado")
    public JAXBElement<Abonado> createAbonado(Abonado value) {
        return new JAXBElement<Abonado>(_Abonado_QNAME, Abonado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DenominacionOrigen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "denominacionOrigen")
    public JAXBElement<DenominacionOrigen> createDenominacionOrigen(DenominacionOrigen value) {
        return new JAXBElement<DenominacionOrigen>(_DenominacionOrigen_QNAME, DenominacionOrigen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Categoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "categoria")
    public JAXBElement<Categoria> createCategoria(Categoria value) {
        return new JAXBElement<Categoria>(_Categoria_QNAME, Categoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getVinosResponse")
    public JAXBElement<GetVinosResponse> createGetVinosResponse(GetVinosResponse value) {
        return new JAXBElement<GetVinosResponse>(_GetVinosResponse_QNAME, GetVinosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVinos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getVinos")
    public JAXBElement<GetVinos> createGetVinos(GetVinos value) {
        return new JAXBElement<GetVinos>(_GetVinos_QNAME, GetVinos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "vino")
    public JAXBElement<Vino> createVino(Vino value) {
        return new JAXBElement<Vino>(_Vino_QNAME, Vino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferenciasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getPreferenciasResponse")
    public JAXBElement<GetPreferenciasResponse> createGetPreferenciasResponse(GetPreferenciasResponse value) {
        return new JAXBElement<GetPreferenciasResponse>(_GetPreferenciasResponse_QNAME, GetPreferenciasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Referencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "referencia")
    public JAXBElement<Referencia> createReferencia(Referencia value) {
        return new JAXBElement<Referencia>(_Referencia_QNAME, Referencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Preferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "preferencia")
    public JAXBElement<Preferencia> createPreferencia(Preferencia value) {
        return new JAXBElement<Preferencia>(_Preferencia_QNAME, Preferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferencias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getReferencias")
    public JAXBElement<GetReferencias> createGetReferencias(GetReferencias value) {
        return new JAXBElement<GetReferencias>(_GetReferencias_QNAME, GetReferencias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferencias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getPreferencias")
    public JAXBElement<GetPreferencias> createGetPreferencias(GetPreferencias value) {
        return new JAXBElement<GetPreferencias>(_GetPreferencias_QNAME, GetPreferencias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenciasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getReferenciasResponse")
    public JAXBElement<GetReferenciasResponse> createGetReferenciasResponse(GetReferenciasResponse value) {
        return new JAXBElement<GetReferenciasResponse>(_GetReferenciasResponse_QNAME, GetReferenciasResponse.class, null, value);
    }

}
