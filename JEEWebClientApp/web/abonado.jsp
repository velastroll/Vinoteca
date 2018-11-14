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
        <%  String msj = (String) session.getAttribute("msj");
            String login = (String) session.getAttribute("login");
        %>      

        <h1>Hello Friend! This is the best Vinoteca have you ever seen!</h1>

        <%
        
            try {
                dominio.WSProductos_Service service = new dominio.WSProductos_Service();
                dominio.WSProductos port = service.getWSProductosPort();
                // TODO process result here
                java.util.List<dominio.Preferencia> result = port.getPreferencias(login);
                out.println("Result = " + result);
                
                
                // GetVinos
                java.lang.String categoria = "";
                java.lang.String denOrigen = "";
                // TODO process result here
                
                for(dominio.Preferencia p: result){
                    categoria = p.getCategoria().getClave();
                    denOrigen = p.getIddenominacion().getNombre();
                    java.util.List<dominio.Vino> vinoList = port.getVinos(categoria, denOrigen);
                    for(dominio.Vino v: vinoList){
        %> 
        
        <form method="post" action="addProduct">
            <input  name="vino-id" value="<%=v.getId()%>" type="hidden"/>
            <h4> Categoría: <%= categoria %> - Denominación de Origen: <%= denOrigen %></h4>
            <button type="submit"> Añadir al carrito </button>
        </form>
        <br>
        <%
                    }
                }
                    
                
            } catch (Exception ex) {
                // TODO handle custom exceptions here
                System.out.println("-- HEMOS PILLAO A UNA EXCEPCION --");
            }
            
        %>


        <table>
            <caption>Nuevo Pedido</caption>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td><c:out value="${item}" /></td>
                <button >comprar</button>
                </tr>
            </c:forEach>
        </table>
        <button>Continuar al carro</button>
        <button>Cerrar sesion</button>

    </body>
</html>
