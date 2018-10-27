/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import DAO.IUsuarioDAO;
import Dominio.Abonado;
import Dominio.Empleado;
import Dominio.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
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
public class GestionUsuario implements GestionUsuarioLocal {

    @EJB
    private IUsuarioDAO usuarioDAO;

    /**
     * Checks if there is an Abonado with the given login in the system database.
     * @param login
     * @return true if it exists, false otherwise.
     */
    @Override
    public boolean isAbonado(String login) {

        Abonado a = usuarioDAO.findAbonadoByLogin(login);
        if (a != null) {
            return true;
        }
        return false;
    }

    /**
     * Checks if there is an Empleado with the given login in the system database.
     * @param login
     * @return true if it exists, false otherwise.
     */
    public boolean isEmpleado(String login) {

        Empleado e = usuarioDAO.findEmpleadoByLogin(login);
        if (e != null) {
            return true;
        }
        return false;
    }

    /**
     * Checks if password is correct for the existing given login and user type.
     *
     * @param login
     * @param psswd
     * @param tipoUser user type
     * @return true if user exists and password ok, false otherwise
     */
    public boolean isPsswdOK(String login, String psswd, String tipoUser) {
        if (tipoUser.equals("abonado")) {
            Abonado a = usuarioDAO.findAbonadoByLogin(login);
            return a.getAbPasswd().equals(psswd);
        } else if (tipoUser.equals("empleado")) {
            Empleado e = usuarioDAO.findEmpleadoByLogin(login);
            return e.getEmPasswd().equals(psswd);
        }
        return false;
    }

    /**
     * Returns user's NIF for the given user's login.
     * @param login
     * @return user's nif if it exists, empty String otherwise
     */
    public String getNif(String login) {
        Persona p = new Persona();
        Abonado a = usuarioDAO.findAbonadoByLogin(login);
        Empleado e = usuarioDAO.findEmpleadoByLogin(login);
        if (a!=null) p = a.getAbNif();
        else if (e != null) p = e.getEmNif();
        else return "";
        return p.getNif();
    }

    /**
     * Adds a new Abonado to the system database.
     * @param nif
     * @param nombre
     * @param apellidos
     * @param login
     * @param passwd
     * @return true if operation successful, false otherwise
     */
    public boolean addAbonado(String nif, String nombre, String apellidos,
            String login, String passwd) {
        if (nif==null || nif.equals(" ") ||nombre==null || nombre.equals(" ") ||
                nif==null || nif.equals(" ") || apellidos==null || apellidos.equals(" ") ||
                login==null || login.equals(" ")){
            return false;
        } else {
            Persona p = new Persona(nif);
            p.setNombre(nombre);
            p.setApellidos(apellidos);
            Abonado a = new Abonado(login);
            a.setAbNif(p);
            a.setAbPasswd(passwd);
            return true;
        }
    }

    /**
     * Deletes the corresponding Abonado fot the given NIF from the system database.
     * @param nif
     * @return true if operation successful, false otherwise
     */
    public boolean delAbonado(String nif) {
        Abonado a = usuarioDAO.findAbonadoByLogin(nif);
        return usuarioDAO.delete(a);
    }

}
