/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionEJB;

import dominio.Preferencia;
import dominio.Referencia;
import dominio.Vino;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alvaro
 */
@Remote
public interface GestionProductosRemote {
    List<Vino> getVinos(String categoria, String denOrigen);
        
    List<Referencia> getReferencias(int vinoId);
    
    List<Preferencia> getPreferencias(String login);
}
