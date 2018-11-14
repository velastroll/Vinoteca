/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dominio.Preferencia;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionEJB.GUsuarioRemote;
import sessionEJB.GestionProductosRemote;


/**
 *
 * @author Alvaro
 */
@WebServlet(name = "CheckLogin", urlPatterns = {"/CheckLogin"})
public class CheckLogin extends HttpServlet {
    @EJB
    private GestionProductosRemote gestionProductos;
    
    @EJB
    private GUsuarioRemote gUsuario;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String login = (String) request.getParameter("login");
        String password = (String) request.getParameter("password");
        String usertype = (String) request.getParameter("usertype");
        
        boolean result = gUsuario.isPsswdOK(login, password, usertype);
        
        String nif = gUsuario.getNif(login);
        session.setAttribute("nif", nif);
        session.setAttribute("login", login);
        session.setAttribute("usertype", usertype);
        
        if (result) {
            if (usertype.equalsIgnoreCase("abonado")){
                
                RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/abonado.jsp");
                dispatcher.forward(request, response);
                System.out.println("preferenciasSize: " + gestionProductos.getPreferencias(login).size());
                System.out.println("preferencias(0): " + gestionProductos.getPreferencias(login).get(0).getCategoria());
                session.setAttribute("preferencias", (List<Preferencia>) gestionProductos.getPreferencias(login));
                
            } else {
                RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/empleado.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            session.setAttribute("msj", "OUPS! Something was wrong... Try again!");
            RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
