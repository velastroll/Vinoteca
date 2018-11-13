/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionEJB;

import dao.AbonadoFacadeLocal;
import dao.EmpleadoFacadeLocal;
import dao.PersonaFacadeLocal;
import dominio.Abonado;
import dominio.Empleado;
import dominio.Persona;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Alvaro
 */
@Stateless
public class GestionUsuarios implements GestionUsuariosRemote {

    @EJB
    private PersonaFacadeLocal personaFacade;
    @EJB
    private EmpleadoFacadeLocal empleadoFacade;
    @EJB
    private AbonadoFacadeLocal abonadoFacade;

    @Override
    public boolean isAbonado(String login) {
        Abonado a = abonadoFacade.find(login);
        if (a != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpleado(String login) {
        Empleado e = empleadoFacade.find(login);
        if (e != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isPsswdOK(String login, String passwd, String tipoUser) {
        if (tipoUser.equalsIgnoreCase("abonado")) {
            Abonado a = abonadoFacade.find(login);
            return a.getAbPasswd().equals(passwd);
        } else {
            Empleado e = empleadoFacade.find(login);
            return e.getEmPasswd().equals(passwd);
        }
    }

    @Override
    public String getNif(String login) {
        Persona p;
        Abonado a = abonadoFacade.find(login);
        if (a != null) {
            p = a.getAbNif();
            return p.getNif();
        } else {
            Empleado e = empleadoFacade.find(login);
            p = e.getEmNif();
            return p.getNif();
        }
    }

    @Override
    public boolean addAbonado(String nif, String nombre, String apellidos, String login, String passwd) {
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setNif(nif);
        Abonado a = new Abonado();
        a.setAbLogin(login);
        a.setAbPasswd(passwd);
        a.setAbNif(p);
        try {
            personaFacade.create(p);
            abonadoFacade.create(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delAbonado(String nif) {
        try {
            Persona p = personaFacade.find(nif);
            personaFacade.remove(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
