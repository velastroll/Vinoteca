/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.DenominacionOrigen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class DenominacionOrigenFacade extends AbstractFacade<DenominacionOrigen> implements DenominacionOrigenFacadeLocal {

    @PersistenceContext(unitName = "GestorProducto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DenominacionOrigenFacade() {
        super(DenominacionOrigen.class);
    }
    
}
