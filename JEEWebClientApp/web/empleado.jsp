<%-- 
    Document   : empleado
    Created on : 13-nov-2018, 22:53:49
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Empleado!</h1>
        <%--
        Gestionar Pedidos
        - Crear webservice para pedidos y recuperarlos
        --%>
        
        <table>
            <caption>Gestion Pedidos</caption>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td><c:out value="${item}" /></td>
                    <button >Modificar</button>
                </tr>
            </c:forEach>
        </table>
                
         <table>
            <caption>Gestion Usuarios</caption>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td><c:out value="${item}" /></td>
                    <button >Eliminar</button>
                </tr>
            </c:forEach>
        </table>
        <button >Nuevo Usuario</button>
        
        
    </body>
</html>
