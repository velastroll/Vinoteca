/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import dao.BodegaFacadeLocal;
import dao.CategoriaFacadeLocal;
import dao.DenominacionOrigenFacadeLocal;
import dao.PreferenciaFacadeLocal;
import dao.ReferenciaFacadeLocal;
import dao.VinoFacadeLocal;
import dominio.Preferencia;
import dominio.Referencia;
import dominio.Vino;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Alvaro
 */
@Stateless
public class GProducto implements GProductoLocal {

    @EJB
    private VinoFacadeLocal vinoFacade;

    @EJB
    private ReferenciaFacadeLocal referenciaFacade;

    @EJB
    private PreferenciaFacadeLocal preferenciaFacade;

    @EJB
    private DenominacionOrigenFacadeLocal denominacionOrigenFacade;

    @EJB
    private CategoriaFacadeLocal categoriaFacade;

    @EJB
    private BodegaFacadeLocal bodegaFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Vino> getVinos(String categoria, String denOrigen) {
        return null;
    }

    @Override
    public List<Referencia> getReferencias(int vinoId) {
        return null;
    }

    @Override
    public List<Preferencia> getPreferencias(String login) {
        return null;
    }
    
    
    
    
}
