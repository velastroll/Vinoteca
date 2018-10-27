/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Preferencia;
import Dominio.Referencia;
import Dominio.Vino;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alvaro
 */
@Local
public interface SesionProductoLocal {
    
    /**
     * Metodo que devuelve una lista de vinos que tienen una categoria y denominacion deorigen particular.
     * 
     * @param categoria categoria de los vinos
     * @param denOrigen denominacion de origen de los vinos
     * @return 
     */
    public List<Vino> getVinos(String categoria, String denOrigen);
    
    /**
     * Metodo obtener las referencias a un determinado vino
     * @param vinoId identidad del vino
     * @return lista de referencias
     */
    public List<Preferencia> getPreferencias(String login);

    /**
     * Metodo para obtener las preferencias de abonado de un determinado usuario
     * @param login del usuario
     * @return lista de preferencias de abonados de ese usuario
     */
    public List<Referencia> getReferencias(int vinoId);
    
}
