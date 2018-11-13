/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Vino;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class VinoFacade extends AbstractFacade<Vino> implements VinoFacadeLocal {
    @PersistenceContext(unitName = "GestionProductosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VinoFacade() {
        super(Vino.class);
    }
        @Override
    public void create(Vino entity){
        getEntityManager().persist(entity);
    }
    
    @Override
    public void edit(Vino entity){
        getEntityManager().merge(entity);
    }
    
    public Vino find(Vino id){
        return getEntityManager().find(Vino.class, id);
    }
    
}
