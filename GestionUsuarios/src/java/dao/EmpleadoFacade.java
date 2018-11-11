/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Empleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class EmpleadoFacade extends AbstractFacade<Empleado> implements EmpleadoFacadeLocal {
    @PersistenceContext(unitName = "GestionUsuariosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoFacade() {
        super(Empleado.class);
    }
    
        @Override
    public void create(Empleado entity){
        getEntityManager().persist(entity);
    }
    
    @Override
    public void edit(Empleado entity){
        getEntityManager().merge(entity);
    }
    
    @Override
    public Empleado find(Object id){
        return getEntityManager().find(Empleado.class, id);
    }
    
}
