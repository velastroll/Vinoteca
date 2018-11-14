package sesion;

/**
 * Carro compra session bean
 * @author martorb
 */
import dominio.Vino;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;
@Stateful
public class CarroBean implements CarroBeanRemote {

    private List<Vino> carro = new ArrayList<>();
      
    /**
     * Returns the carro compra list
     * @return carro list
     */
    @Override
    public List getList() {
        return carro;
    }

 
    
    /**
     * Adds new vino to carro compra list
     * @param vino Vino to add to the carro list
     */
    @Override
    public void addProducto(Vino vino) {
        carro.add(vino);
    }
    
    /**
     * Removes vino from carro compra list
     * @param vino Vino to remove from carro list
     */
    @Override
    public void delProducto(Vino vino){
        carro.remove(vino);
    }
}