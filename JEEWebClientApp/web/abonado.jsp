<%-- 
    Document   : abonado
    Created on : 13-nov-2018, 22:53:28
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
        <h1>Hello Abonado!</h1>
        
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
