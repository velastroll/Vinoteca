/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SesionEJB;

import DAO.AbonadoFacadeLocal;
import DAO.EmpleadoFacadeLocal;
import DAO.PersonaFacadeLocal;
import Dominio.Abonado;
import Dominio.Empleado;
import Dominio.Persona;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Alvaro
 */
@Stateless
public class GUsuario implements GUsuarioLocal {

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private EmpleadoFacadeLocal empleadoFacade;

    @EJB
    private AbonadoFacadeLocal abonadoFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public boolean isAbonado(String login) {
        Abonado a = abonadoFacade.find(login);
        return a != null;
    }

    @Override
    public boolean isPsswdOK(String login, String psswd, String tipoUser) {
        if (tipoUser.equals("abonado")) {
            Abonado a = abonadoFacade.find(login);
            return a.getAbPasswd().equals(psswd);
        } else if (tipoUser.equals("empleado")) {
            Empleado e = empleadoFacade.find(login);
            return e.getEmPasswd().equals(psswd);
        }
        return false;
    }

    @Override
    public String getNif(String login) {
        Persona p = personaFacade.find(login);
        return p.getNif();
    }

    @Override
    public boolean addAbonado(String nif, String nombre, String apellidos, String login, String psswd) {
        if (nif == null || nif.equals(" ") || nombre == null || nombre.equals(" ")
                || nif == null || nif.equals(" ") || apellidos == null || apellidos.equals(" ")
                || login == null || login.equals(" ")) {
            return false;
        } else {
            Persona p = new Persona(nif);
            p.setNombre(nombre);
            p.setApellidos(apellidos);
            Abonado a = new Abonado(login);
            a.setAbNif(p);
            a.setAbPasswd(psswd);
            personaFacade.create(p);
            abonadoFacade.create(a);
            return true;
        }
    }

    @Override
    public boolean delAbonado(String nif) {
        Abonado a = abonadoFacade.find(nif);
        abonadoFacade.remove(a);
        return true;
    }

    @Override
    public boolean isEmpleado(String login
    ) {
        Empleado e = empleadoFacade.find(login);
        return e != null;
    }

}
