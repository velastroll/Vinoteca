package dominio;

import dominio.Abonado;
import dominio.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T10:10:50")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile CollectionAttribute<Persona, Abonado> abonadoCollection;
    public static volatile CollectionAttribute<Persona, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Persona, String> nif;
    public static volatile SingularAttribute<Persona, String> nombre;

}