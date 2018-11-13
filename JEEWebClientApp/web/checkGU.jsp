<%-- 
    Document   : login
    Created on : 12-nov-2018, 18:46:25
    Author     : Alvaro Velasco
--%>
<%@page import="servlet.UserController" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String msj = (String) session.getAttribute("msj");
            String option = (String) session.getAttribute("selection");
            if(option==null) option="1";
        %>


        <form method="post" action="UserController">
            <h3>Insert login to check if is ABONADO:</h3>
            <input name="CheckAbonado" placeholder="login" required />
            <input  name="selection" value="1" type="hidden"/>
            <button type="submit">COMPROBAR</button>
            
            <% if(option.equals("1")) {%><h3><%=msj%></h3><%}%>

        </form>
        <form method="post" action="UserController">
            <h3>Insert login to check if is EMPLEADO:</h3>
            <input name="CheckEmpleado" placeholder="login" required/>
            <input  name="selection" value="2" type="hidden"/>
            <button type="submit">COMPROBAR</button>
            <% if(option.equals("2")) {%><h3><%=msj%></h3><%}%>
        </form>
        <form method="post" action="UserController">
            <h3>Insert login, password and type to check credentials:</h3>
            <input name="CredentialsLogin" placeholder="login" required/>
            <input name="CredentialsPassword" placeholder="password" required/>
            <input name="CredentialsType" placeholder="user type" required/>
            <input  name="selection" value="3" type="hidden"/>
            <button type="submit">COMPROBAR</button>
            <% if(option.equals("3")) {%><h3><%=msj%></h3><%}%>
        </form>
        <form method="post" action="UserController">
            <h3>Insert login to get DNI</h3>
            <input name="getDNIByLogin" placeholder="login" required/>
            <input  name="selection" value="4" type="hidden"/>
            <button type="submit">COMPROBAR</button>
            <% if(option.equals("4")) {%><h3><%=msj%></h3><%}%>
        </form>
        <form method="post" action="UserController">
            <h3>Insert Data to add NEW ABONADO</h3>
            <input name="AbNif" placeholder="NEW Nif" required/>
            <input name="AbName" placeholder="NEW Name" required/>
            <input name="AbSurname" placeholder="NEW Surname" required/>
            <input name="AbLogin" placeholder="NEW Login" required/>
            <input type="password" name="AbPasswd" placeholder="NEW Passwd" required/>
            <input  name="selection" value="5" type="hidden"/>
            <button type="submit">COMPROBAR</button>
            <% if(option.equals("5")) {%><h3><%=msj%></h3><%}%>
        </form>
    </body>
</html>