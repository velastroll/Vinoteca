package dominio;

import dominio.Vino;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T16:24:52")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, String> cif;
    public static volatile SingularAttribute<Bodega, String> direccion;
    public static volatile SingularAttribute<Bodega, Integer> id;
    public static volatile CollectionAttribute<Bodega, Vino> vinoCollection;
    public static volatile SingularAttribute<Bodega, String> nombre;

}