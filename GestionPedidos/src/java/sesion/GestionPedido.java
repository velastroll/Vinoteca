/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion;

import dao.AbonadoFacadeLocal;
import dao.PedidoFacadeLocal;
import dominio.Abonado;
import dominio.EstadoPedido;
import dominio.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author martorb
 */
@Stateless
public class GestionPedido implements GestionPedidoRemote {
    private Pedido pedido;
    private EstadoPedido estado;
    
     
    @EJB
    private AbonadoFacadeLocal abonadoFacade;
    @EJB
    private PedidoFacadeLocal pedidoFacade;

    /**
     * 
     * @param login
     * @param fecha
     * @param importe
     * @param referencia
     * @return 
     */
    public boolean addPedido(String login, String fecha, float importe, int referencia){
        boolean resultado = false;
        String nif = null;
        try{
            List<Abonado> abonados= abonadoFacade.findAll();
            for(Abonado a : abonados){
                if(a.getAbLogin().equals(login)){
                    nif = a.getAbNif().getNif();
                    if (nif!=null) resultado = true;
                }
            }
            int id = pedidoFacade.count()+1;
            pedido = new Pedido(id, nif, referencia);
            estado = new EstadoPedido("pendiente");
            pedido.setFecha(fecha);
            pedido.setImporte(importe);
            pedido.setPeEstado(estado);
            return resultado;
        }catch(Exception e){
            return false;
        }
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public List<Pedido> getPedidosPendientes(){
        List<Pedido> pedidos = pedidoFacade.findAll();
        for(Pedido p: pedidos){
            if(!p.getPeEstado().equals("pendiente")){
               pedidos.remove(p);
            }
        }
        return pedidos;
    }
    
    /**
     * 
     * @param numPedido
     * @param nuevoEstado
     * @return 
     */
    public boolean editPedido(int numPedido, String nuevoEstado){
        try{
        Pedido p = pedidoFacade.find(numPedido);
        EstadoPedido estado = new EstadoPedido();
        estado.setEstado(nuevoEstado);
        p.setPeEstado(estado);
        pedidoFacade.edit(p);
        return true;
        }catch(Exception e){
            return false;
        }

    }

}
