/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion;

import dominio.Vino;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author martorb
 */
@Remote
public interface CarroBeanRemote {

    public List getList();

    public void addProducto(Vino vino);

    public void delProducto(Vino vino);
    
}
