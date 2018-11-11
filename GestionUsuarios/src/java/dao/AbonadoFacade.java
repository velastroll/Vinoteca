/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Abonado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class AbonadoFacade extends AbstractFacade<Abonado> implements AbonadoFacadeLocal {
    @PersistenceContext(unitName = "GestionUsuariosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbonadoFacade() {
        super(Abonado.class);
    }
    
    @Override
    public void create(Abonado entity){
        getEntityManager().persist(entity);
    }
    
    @Override
    public void edit(Abonado entity){
        getEntityManager().merge(entity);
    }
    
    @Override
    public Abonado find(Object id){
        return getEntityManager().find(Abonado.class, id);
    }
    
}
