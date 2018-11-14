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
public interface GUsuarioRemote {

    public String getNif(String login);

    public boolean isPsswdOK(String login, String passwd, String tipoUser);

    public boolean isEmpleado(String login);

    public boolean isAbonado(String login);

    public boolean delAbonado(String nif);

    public boolean addAbonado(String nif, String nombre, String apellidos, String login, String passwd);
    
}
