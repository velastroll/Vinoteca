/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Referencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class ReferenciaFacade extends AbstractFacade<Referencia> implements ReferenciaFacadeLocal {

    @PersistenceContext(unitName = "GestorProducto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReferenciaFacade() {
        super(Referencia.class);
    }
    
}
