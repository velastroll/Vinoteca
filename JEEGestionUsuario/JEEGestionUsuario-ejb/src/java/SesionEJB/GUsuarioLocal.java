/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SesionEJB;

import javax.ejb.Local;

/**
 *
 * @author Alvaro
 */
@Local
public interface GUsuarioLocal {

    boolean isAbonado(String login);

    boolean isPsswdOK(String login, String psswd, String tipoUser);

    String getNif(String login);

    boolean addAbonado(String nif, String nombre, String apellidos, String login, String psswd);

    boolean delAbonado(String nif);

    boolean isEmpleado(String login);

    
}
