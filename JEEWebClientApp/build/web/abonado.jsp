<%-- 
    Document   : abonado
    Created on : 13-nov-2018, 22:53:28
    Author     : Alvaro
--%>

<%@page import="dominio.Preferencia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to Vinoteca</title>
    </head>
    <body>
        <% String msj = (String) session.getAttribute("msj");
          %>      
        
        <h1>Hello Friend! This is the best Vinoteca have you ever seen!</h1>
        
        <% 
            List<Preferencia> lPrefs = (List<Preferencia>) session.getAttribute("preferencias");
            
            if (lPrefs!=null)
            for(Preferencia p: lPrefs){
        %>
        
        <form method="post" action="addProduct">
            <h4> Categoría: <%= p.getCategoria().getNombre() %></h4>
            <h4> Categoría: <%= p.getIddenominacion().getNombre() %></h4>
            <br>
            <button type="submit"> Añadir al carrito </button>
            <% if (msj!=null) { %><%= msj %><% } %>
        </form>
        
        <% } %>
    </body>
</html>
