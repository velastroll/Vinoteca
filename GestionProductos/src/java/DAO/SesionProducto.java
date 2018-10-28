/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Preferencia;
import Dominio.Referencia;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Alvaro
 */
@Stateless
public class SesionProducto implements SesionProductoLocal {


    @Override
    public List<Vino> getVinos(String categoria, String denOrigen){
        return null;
    }
    

    @Override
    public List<Referencia> getReferencias(int vinoId){
        return null;
    }
    

    @Override
    public List<Preferencia> getPreferencias(String login){
        return null;
    }
}
