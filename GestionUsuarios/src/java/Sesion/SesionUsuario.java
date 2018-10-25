/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import DAO.IUsuarioDAO;
import Dominio.Abonado;
import Dominio.Empleado;
import java.util.List;
import javax.ejb.EJB;
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

    @EJB
    private IUsuarioDAO usuarioDAO;

    
    
    
    /**
     * Dado un login, nos devuelve true si está abonado en el sistema.
     * @param login
     * @return 
     */
    @Override
    public boolean isAbonado(String login){

        Abonado a = usuarioDAO.findAbonadoByLogin(login);
        if (a!=null) return true;
        return false;
    }
    
    /**
     *  Dado un login, nos devuelve true si está abonado en el sistema.
     * @param login
     * @return 
     */
    public boolean isEmpleado(String login){

        Empleado e = usuarioDAO.findEmpleadoByLogin(login);
        if (e!=null) return true;
        return false;
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



