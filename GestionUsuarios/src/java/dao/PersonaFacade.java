/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {
    
    @PersistenceContext(unitName = "GestionUsuariosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
        @Override
    public void create(Persona entity){
        getEntityManager().persist(entity);
    }
    
    @Override
    public void edit(Persona entity){
        getEntityManager().merge(entity);
    }
    
    @Override
    public Persona find(Object id){
        return getEntityManager().find(Persona.class, id);
    }
    
}
