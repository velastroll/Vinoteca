/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Abonado;
import Dominio.Empleado;
import javax.ejb.Stateless;

/**
 *
 * @author Mario Torbado
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
     public Abonado findAbonadoByLogin(String login){
        return null;
    }
    
    public Empleado findEmpleadoByLogin(String login){
        return null;
    }
    
}
