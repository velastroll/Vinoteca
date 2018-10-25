/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Abonado;
import Dominio.Empleado;
import java.util.List;
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
public class UsuarioDAO implements IUsuarioDAO {

    //TODO sacar esto a DAO
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
    EntityManager em = emf.createEntityManager();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * Dado un login, nos devuelve una entity de tipo Abogado, que es null si no
     * está en el sistema.
     * @param login
     * @return a: Abonado
     */
    public Abonado findAbonadoByLogin(String login) {
        TypedQuery<Abonado> consultaAbonado = em.createNamedQuery("Abonado.findByAbLogin", Abonado.class);
        consultaAbonado.setParameter("abLogin", login);
        List<Abonado> abonado = consultaAbonado.getResultList();
        return abonado.get(0);
    }
    
    public Empleado findEmpleadoByLogin(String login) {
        TypedQuery<Empleado> consultaEmpleado = em.createNamedQuery("Empleado.findByEmLogin", Empleado.class);
        consultaEmpleado.setParameter("emLogin", login);
        List<Empleado> empleado = consultaEmpleado.getResultList();
        return empleado.get(0);
    }

}
