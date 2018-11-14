package dominio;

import dominio.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T10:10:50")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Persona> emNif;
    public static volatile SingularAttribute<Empleado, String> emPasswd;
    public static volatile SingularAttribute<Empleado, String> emLogin;
    public static volatile SingularAttribute<Empleado, Boolean> puedeModificar;

}