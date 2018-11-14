package dominio;

import dominio.EstadoPedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T16:24:46")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, String> fecha;
    public static volatile SingularAttribute<Pedido, Integer> peId;
    public static volatile SingularAttribute<Pedido, Integer> peReferencia;
    public static volatile SingularAttribute<Pedido, EstadoPedido> peEstado;
    public static volatile SingularAttribute<Pedido, Float> importe;
    public static volatile SingularAttribute<Pedido, String> peNif;

}