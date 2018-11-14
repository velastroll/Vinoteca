/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import sesion.GestionPedidoRemote;

/**
 *
 * @author Alvaro
 */
@WebService(serviceName = "WS_Pedidos")
@Stateless()
public class WS_Pedidos {
    @EJB
    private GestionPedidoRemote ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation() {
        //TODO write your implementation code here:
        return null;
    }
    
    public boolean addPedido(String login, String fecha, float importe, int referencia){
        return ejbRef.addPedido(login, fecha, importe, referencia);
    }
    
    public List<Pedido> getPedidosPendientes(){
        return ejbRef.getPedidosPendientes();
    }

    public boolean editPedido(int numPedido, String nuevoEstado){
        return ejbRef.editPedido(numPedido, nuevoEstado);
    }
    
    
}
