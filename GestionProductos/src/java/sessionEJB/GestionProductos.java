/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionEJB;

import dao.PreferenciaFacadeLocal;
import dao.VinoFacadeLocal;
import dominio.Preferencia;
import dominio.Referencia;
import dominio.Vino;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Alvaro
 */
@Stateless
public class GestionProductos implements GestionProductosRemote {
    
    
    @EJB
    private PreferenciaFacadeLocal preferenciaFacade;
    @EJB
    private VinoFacadeLocal vinoFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List<Vino> getVinos(String categoria, String denOrigen){
        List<Vino> wine = vinoFacade.findAll();
        List<Vino> wineToReturn = new ArrayList();
        
        System.out.println("INICIAL cat " + categoria + " denom " + denOrigen);
        String category, denOr;
        for (Vino w : wine) {
            category = w.getCategoria().getClave();
            denOr = w.getIddenominacion().getNombre();
            System.out.println("cat " + category + " denom " + denOr);
            if (category.equalsIgnoreCase(categoria) && denOr.equalsIgnoreCase(denOrigen))
                wineToReturn.add(w);
        }
        return wineToReturn;
    }

    @Override
    public List<Referencia> getReferencias(int vinoId) {
        Vino wine = vinoFacade.find(vinoId);
        return (List<Referencia>) wine.getReferenciaCollection();
    }

    @Override
    public List<Preferencia> getPreferencias(String login) {
        List<Preferencia> preferences = preferenciaFacade.findAll();
        List<Preferencia> prefToReturn = new ArrayList();
        for(Preferencia p: preferences){
            String pLogin = p.getNifabonado().getAbLogin();
            if (pLogin.equalsIgnoreCase(login))
                prefToReturn.add(p);
        }
        return prefToReturn;
    }
    
    public Vino getVino(int id){
        List<Vino> vs = vinoFacade.findAll();
        for (Vino v : vs) {
            if (v.getId() == id)
                return v;
        }
        return null;
    }

}
