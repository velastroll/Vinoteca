package dominio;

import dominio.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T16:24:46")
@StaticMetamodel(EstadoPedido.class)
public class EstadoPedido_ { 

    public static volatile SingularAttribute<EstadoPedido, String> estado;
    public static volatile SingularAttribute<EstadoPedido, String> epClave;
    public static volatile CollectionAttribute<EstadoPedido, Pedido> pedidoCollection;

}