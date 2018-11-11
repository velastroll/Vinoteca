/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionEJB;

import javax.ejb.Remote;

/**
 *
 * @author Alvaro
 */
@Remote
public interface GestionUsuariosRemote {
    boolean isAbonado(String login);
    boolean isEmpleado(String login);
    boolean isPsswdOK(String login, String passwd, String tipoUser);
    String getNif(String login);
    boolean addAbonado(String nif, String nombre, String apellidos, String login, String passwd);
    boolean delAbonado(String nif);
}
