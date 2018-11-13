package dominio;

import dominio.Persona;
import dominio.Preferencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-13T23:49:34")
@StaticMetamodel(Abonado.class)
public class Abonado_ { 

    public static volatile SingularAttribute<Abonado, String> abLogin;
    public static volatile CollectionAttribute<Abonado, Preferencia> preferenciaCollection;
    public static volatile SingularAttribute<Abonado, String> abPasswd;
    public static volatile SingularAttribute<Abonado, Persona> abNif;

}