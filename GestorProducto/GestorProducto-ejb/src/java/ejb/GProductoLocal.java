/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import dominio.Preferencia;
import dominio.Referencia;
import dominio.Vino;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alvaro
 */
@Local
public interface GProductoLocal {

    List<Vino> getVinos(String categoria, String denOrigen);

    List<Referencia> getReferencias(int vinoId);

    List<Preferencia> getPreferencias(String login);
    
}
