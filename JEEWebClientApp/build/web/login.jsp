<%-- 
    Document   : login
    Created on : 13-nov-2018, 22:39:17
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN TO VINOTECA</title>
    </head>
    <body>
        
        <% String msj = (String) session.getAttribute("msj");
          %>      
        
        <h1>Hello Friend! This is the best Vinoteca have you ever seen!</h1>
        <form method="post" action="CheckLogin">
            <h3> Insert credentials to enter: </h3>
            <input name="login" placeholder="Username" required/>
            <input type="password" name="password" placeholder="Password" required />
            <br>
            <input type="radio" name="usertype" value="abonado"> Abonado<br>
            <input type="radio" name="usertype" value="empleado"> Empleado<br>
            <button type="submit"> Entrar </button>
            <% if (msj!=null) { %><%= msj %><% } %>
        </form>
        
    </body>
</html>
