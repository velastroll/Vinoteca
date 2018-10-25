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
 * @author Mario Torbado
 */
@Stateless
public class SesionUsuario implements SesionUsuarioLocal {

    @EJB
    private IUsuarioDAO usuarioDAO;

    /**
     * Dado un login, nos devuelve true si está abonado en el sistema.
     *
     * @param login
     * @return
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
     * Dado un login, nos devuelve true si está abonado en el sistema.
     *
     * @param login
     * @return
     */
    public boolean isEmpleado(String login) {

        Empleado e = usuarioDAO.findEmpleadoByLogin(login);
        if (e != null) {
            return true;
        }
        return false;
    }

    /**
     * Método que comprueba si los datos de acceso son correctos.
     *
     * @param login nombre de usuario
     * @param psswd contraseña del usuario
     * @param tipoUser tipo de usuario
     * @return boolean true si los datos son correctos
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
     * Dado un login, devuelve el DNI correspondiente a esa persona.
     * @param login
     * @return
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
     *
     * @param nif
     * @param nombre
     * @param apellidos
     * @param login
     * @param passwd
     * @return
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
     *
     * @param nif
     * @return
     */
    public boolean delAbonado(String nif) {
        return false;
    }

}
