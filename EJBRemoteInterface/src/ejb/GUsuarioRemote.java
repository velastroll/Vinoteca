/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author Alvaro
 */
@Remote
public interface GUsuarioRemote {

    boolean isAbonado(String login);

    boolean isEmpleado(String login);

    boolean isPsswdOK(String login, String psswd, String tipoUser);

    String getNif(String login);

    boolean addAbonado(String nif, String nombre, String apellidos, String login, String psswd);

    boolean delAbonado(String nif);
    
}
