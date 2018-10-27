/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Abonado;
import Dominio.Empleado;
import Dominio.Persona;
import javax.ejb.Local;

/**
 *
 * @author Mario Torbado
 */
@Local
public interface IUsuarioDAO {

    public Abonado findAbonadoByLogin(String login);

    public Empleado findEmpleadoByLogin(String login);

    public boolean create(Abonado abonado);

    public boolean delete(Abonado abonado);

    
}
