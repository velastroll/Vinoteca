package dominio;

import dominio.Preferencia;
import dominio.Vino;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-13T23:12:21")
@StaticMetamodel(DenominacionOrigen.class)
public class DenominacionOrigen_ { 

    public static volatile CollectionAttribute<DenominacionOrigen, Preferencia> preferenciaCollection;
    public static volatile SingularAttribute<DenominacionOrigen, Integer> doId;
    public static volatile CollectionAttribute<DenominacionOrigen, Vino> vinoCollection;
    public static volatile SingularAttribute<DenominacionOrigen, String> nombre;

}