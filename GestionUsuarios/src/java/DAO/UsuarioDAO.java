/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Abonado;
import Dominio.Empleado;
import Dominio.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alvaro Velasco
 * @author Mario Torbado
 */
@Stateless
public class UsuarioDAO implements IUsuarioDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
    EntityManager em = emf.createEntityManager();

    /**
     * Returns an Abonado instance from the database given its login.
     * @param login login of the Abonado.
     * @return corresponding Abonado instance from the database (if exists, null otherwise).
     */
    public Abonado findAbonadoByLogin(String login) {
        TypedQuery<Abonado> consultaAbonado = em.createNamedQuery("Abonado.findByAbLogin", Abonado.class);
        consultaAbonado.setParameter("abLogin", login);
        List<Abonado> abonado = consultaAbonado.getResultList();
        return abonado.get(0);
    }
    
    /**
     * Retuns an  Empleado instance from the database given its login.
     * @param login login of the Empleado.
     * @return corresponding Empleado instance from the database (if exists, null otherwise).
     */
    public Empleado findEmpleadoByLogin(String login) {
        TypedQuery<Empleado> consultaEmpleado = em.createNamedQuery("Empleado.findByEmLogin", Empleado.class);
        consultaEmpleado.setParameter("emLogin", login);
        List<Empleado> empleado = consultaEmpleado.getResultList();
        return empleado.get(0);
    }

    /**
     * Creates a new table entry for the given Abonado instance in the database.
     * @param abonado Abonado instance to record into the database.
     * @return true if operation succesful, false otherwise.
     */
    public boolean create(Abonado abonado){
        try{
            em.persist(abonado);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /**
     * Deletes the corresponding table entry for the given Abonado instance in
     * the database.
     * @param abonado
     * @return true if operation succesful, false otherwise.
     */
    public boolean delete(Abonado abonado){
        try{
            em.remove(abonado);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

}
