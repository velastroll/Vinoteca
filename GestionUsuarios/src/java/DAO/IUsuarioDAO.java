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
 * DAO interface for accessing and modifying USUARIO tables using CRUD
 * operations.
 * @author Alvaro Velasco
 * @author Mario Torbado
 */
@Local
public interface IUsuarioDAO {

    /**
     * Returns an Abonado instance from the database given its login.
     * @param login login of the Abonado.
     * @return corresponding Abonado instance from the database.
     */
    public Abonado findAbonadoByLogin(String login);

    /**
     * Retuns an  Empleado instance from the database given its login.
     * @param login login of the Empleado.
     * @return corresponding Empleado instance from the database.
     */
    public Empleado findEmpleadoByLogin(String login);

    /**
     * Creates a new table entry for the given Abonado instance in the database.
     * @param abonado Abonado instance to record into the database.
     * @return true if operation succesful, false otherwise.
     */
    public boolean create(Abonado abonado);

    /**
     * Deletes the corresponding table entry for the given Abonado instance in
     * the database.
     * @param abonado
     * @return true if operation succesful, false otherwise.
     */
    public boolean delete(Abonado abonado);

    
}
