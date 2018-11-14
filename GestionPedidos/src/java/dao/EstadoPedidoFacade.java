/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dominio.EstadoPedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matorb
 */
@Stateless
public class EstadoPedidoFacade extends AbstractFacade<EstadoPedido> implements EstadoPedidoFacadeLocal {
    @PersistenceContext(unitName = "GestionPedidosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoPedidoFacade() {
        super(EstadoPedido.class);
    }
    
}
