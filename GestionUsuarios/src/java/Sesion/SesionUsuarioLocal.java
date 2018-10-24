/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import javax.ejb.Local;

/**
 *
 * @author Mario Torbado
 */
@Local
public interface SesionUsuarioLocal {
    /**
     * 
     * @param login
     * @return 
     */
    public boolean isAbonado(String login);

    /**
     * 
     * @param login
     * @param psswd
     * @param tipoUser
     * @return 
     */
    public boolean isPsswdOK(String login, String psswd, String tipoUser);
    
    /**
     * 
     * @param login
     * @return 
     */
    public boolean isEmpleado(String login);

    /**
     * 
     * @param login
     * @return 
     */
    public String getNif(String login);

    /**
     * 
     * @param nif
     * @param nombre
     * @param apellidos
     * @param login
     * @param passwd
     * @return 
     */
    public boolean addAbonado(String nif, String nombre, String apellidos, String login, String passwd);
    
    /**
     * 
     * @param nif
     * @return 
     */
    public boolean delAbonado(String nif);
    
}
