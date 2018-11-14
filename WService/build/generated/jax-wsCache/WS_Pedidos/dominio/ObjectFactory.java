
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

    private final static QName _GetPedidosPendientesResponse_QNAME = new QName("http://dominio/", "getPedidosPendientesResponse");
    private final static QName _Operation_QNAME = new QName("http://dominio/", "operation");
    private final static QName _AddPedidoResponse_QNAME = new QName("http://dominio/", "addPedidoResponse");
    private final static QName _EditPedido_QNAME = new QName("http://dominio/", "editPedido");
    private final static QName _EditPedidoResponse_QNAME = new QName("http://dominio/", "editPedidoResponse");
    private final static QName _EstadoPedido_QNAME = new QName("http://dominio/", "estadoPedido");
    private final static QName _Pedido_QNAME = new QName("http://dominio/", "pedido");
    private final static QName _GetPedidosPendientes_QNAME = new QName("http://dominio/", "getPedidosPendientes");
    private final static QName _OperationResponse_QNAME = new QName("http://dominio/", "operationResponse");
    private final static QName _AddPedido_QNAME = new QName("http://dominio/", "addPedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dominio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPedido }
     * 
     */
    public AddPedido createAddPedido() {
        return new AddPedido();
    }

    /**
     * Create an instance of {@link GetPedidosPendientes }
     * 
     */
    public GetPedidosPendientes createGetPedidosPendientes() {
        return new GetPedidosPendientes();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link EstadoPedido }
     * 
     */
    public EstadoPedido createEstadoPedido() {
        return new EstadoPedido();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link EditPedidoResponse }
     * 
     */
    public EditPedidoResponse createEditPedidoResponse() {
        return new EditPedidoResponse();
    }

    /**
     * Create an instance of {@link AddPedidoResponse }
     * 
     */
    public AddPedidoResponse createAddPedidoResponse() {
        return new AddPedidoResponse();
    }

    /**
     * Create an instance of {@link EditPedido }
     * 
     */
    public EditPedido createEditPedido() {
        return new EditPedido();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link GetPedidosPendientesResponse }
     * 
     */
    public GetPedidosPendientesResponse createGetPedidosPendientesResponse() {
        return new GetPedidosPendientesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPendientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getPedidosPendientesResponse")
    public JAXBElement<GetPedidosPendientesResponse> createGetPedidosPendientesResponse(GetPedidosPendientesResponse value) {
        return new JAXBElement<GetPedidosPendientesResponse>(_GetPedidosPendientesResponse_QNAME, GetPedidosPendientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "addPedidoResponse")
    public JAXBElement<AddPedidoResponse> createAddPedidoResponse(AddPedidoResponse value) {
        return new JAXBElement<AddPedidoResponse>(_AddPedidoResponse_QNAME, AddPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "editPedido")
    public JAXBElement<EditPedido> createEditPedido(EditPedido value) {
        return new JAXBElement<EditPedido>(_EditPedido_QNAME, EditPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "editPedidoResponse")
    public JAXBElement<EditPedidoResponse> createEditPedidoResponse(EditPedidoResponse value) {
        return new JAXBElement<EditPedidoResponse>(_EditPedidoResponse_QNAME, EditPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "estadoPedido")
    public JAXBElement<EstadoPedido> createEstadoPedido(EstadoPedido value) {
        return new JAXBElement<EstadoPedido>(_EstadoPedido_QNAME, EstadoPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "pedido")
    public JAXBElement<Pedido> createPedido(Pedido value) {
        return new JAXBElement<Pedido>(_Pedido_QNAME, Pedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPendientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "getPedidosPendientes")
    public JAXBElement<GetPedidosPendientes> createGetPedidosPendientes(GetPedidosPendientes value) {
        return new JAXBElement<GetPedidosPendientes>(_GetPedidosPendientes_QNAME, GetPedidosPendientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dominio/", name = "addPedido")
    public JAXBElement<AddPedido> createAddPedido(AddPedido value) {
        return new JAXBElement<AddPedido>(_AddPedido_QNAME, AddPedido.class, null, value);
    }

}
