/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Preferencia;
import dominio.Referencia;
import dominio.Vino;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import sessionEJB.GestionProductosRemote;

/**
 *
 * @author Alvaro
 */
@WebService(serviceName = "WSgProductos")
public class WSgProductos {
    @EJB
    private GestionProductosRemote ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getVinos")
    public List<Vino> getVinos(@WebParam(name = "categoria") String categoria, @WebParam(name = "denOrigen") String denOrigen) {
        return ejbRef.getVinos(categoria, denOrigen);
    }

    @WebMethod(operationName = "getReferencias")
    public List<Referencia> getReferencias(@WebParam(name = "vinoId") int vinoId) {
        return ejbRef.getReferencias(vinoId);
    }

    @WebMethod(operationName = "getPreferencias")
    public List<Preferencia> getPreferencias(@WebParam(name = "login") String login) {
        return ejbRef.getPreferencias(login);
    }
    
}
