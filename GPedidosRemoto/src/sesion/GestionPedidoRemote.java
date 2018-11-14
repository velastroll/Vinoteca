/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion;

import dominio.Pedido;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author matorb
 */
@Remote
public interface GestionPedidoRemote {

    public boolean addPedido(String login, String fecha, float importe, int referencia);

    public List<Pedido> getPedidosPendientes();

    public boolean editPedido(int numPedido, String nuevoEstado);
    
}
