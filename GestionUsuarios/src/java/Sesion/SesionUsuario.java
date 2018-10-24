/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import Dominio.Abonado;
import Dominio.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 *
 * @author Mario Torbado
 */
@Stateless
public class SesionUsuario implements SesionUsuarioLocal {
    //TODO sacar esto a DAO
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
    EntityManager em = emf.createEntityManager();
    
    
    
    /**
     * 
     * @param login
     * @return 
     */
    public boolean isAbonado(String login){
         //TODO sacar esto a DAO
        TypedQuery<Abonado> consultaAbonado = em.createNamedQuery("Abonado.findByAbLogin", Abonado.class);
        consultaAbonado.setParameter("abLogin", login);
        List<Abonado> l = consultaAbonado.getResultList();
        return !l.isEmpty();

    }
    
    /**
     * 
     * @param login
     * @return 
     */
    public boolean isEmpleado(String login){
        //TODO sacar esto a DAO
        TypedQuery<Empleado> consultaEmpleado = em.createNamedQuery("Empleado.findByEmLogin", Empleado.class);
        consultaEmpleado.setParameter("emLogin", login);
        List<Empleado> l = consultaEmpleado.getResultList();
        return !l.isEmpty();
        
    }
    
    /**
     * 
     * @param login
     * @param psswd
     * @param tipoUser
     * @return 
     */
    public boolean isPsswdOK(String login, String psswd, String tipoUser){
        boolean result = false;
        if (tipoUser.equals("abonado")){
            //interfazdao.findAbonadoByLogin(login);
            //...
        }
        
        return result;
    }
    
    /**
     * 
     * @param login
     * @return 
     */
    public String getNif(String login){
        String nif = null;
        
        return nif;
    }
    
    /**
     * 
     * @param nif
     * @param nombre
     * @param apellidos
     * @param login
     * @param passwd
     * @return 
     */
    public boolean addAbonado(String nif, String nombre, String apellidos,
                              String login, String passwd){
        boolean result = false;
        return result;
    }
    
    /**
     * 
     * @param nif
     * @return 
     */
    public boolean delAbonado(String nif){
        boolean result = false;
        return result;
    }
    
}



