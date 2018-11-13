/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionEJB.GestionUsuariosRemote;

/**
 *
 * @author Alvaro
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    
    @EJB
    private GestionUsuariosRemote gestionUsuarios;

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
        
        String selection = (String) request.getParameter("selection");
        session.setAttribute("selection", selection);
        String login;
        boolean result;
        switch (selection) {
            case "1":
                // Check if is Abonado
                System.out.println("Caso 1");
                login = request.getParameter("CheckAbonado");
                result = gestionUsuarios.isAbonado(login);
                if(result)
                    session.setAttribute("msj", "WOW! It was saved as ABONADO");
                else session.setAttribute("msj", "SORRY, I cannot find it in my database...");
                break;
            case "2":
                // Check if is Empleado
                login = request.getParameter("CheckEmpleado");
                result = gestionUsuarios.isEmpleado(login);
                if(result)
                    session.setAttribute("msj", "Yeah! It was saved as EMPLEADO.");
                else session.setAttribute("msj", "SORRY, I can't find it in my database...");
                break;
            case "3":
                // Check credentials
                login = request.getParameter("CredentialsLogin");
                String psswd = request.getParameter("CredentialsPassword");
                String type = request.getParameter("CredentialsType");
                result = gestionUsuarios.isPsswdOK(login, psswd, type);
                if(result)
                    session.setAttribute("msj", "AMAZING! This was a good credentials.");
                else session.setAttribute("msj", "Something was wrong...");
                break;
            case "4":
                // Get DNI by login
                login = request.getParameter("getDNIByLogin");
                String dni = gestionUsuarios.getNif(login);
                session.setAttribute("msj", dni);
                break;
            case "5":
                // Add a new abonado
                String nif = request.getParameter("AbNif");
                String name = request.getParameter("AbName");
                String surname = request.getParameter("AbSurname");
                login = request.getParameter("AbLogin");
                String passwd = request.getParameter("AbPasswd");
                result = gestionUsuarios.addAbonado(nif, name, surname, login, passwd);
                if(result)
                    session.setAttribute("msj", "Added successfuly.");
                else session.setAttribute("msj", "I cannot added, sorry.");
                break;
        }
        
        RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
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
