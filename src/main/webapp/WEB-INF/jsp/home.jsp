<%-- 
    Document   : home
    Created on : Dec 6, 2018, 4:13:16 PM
    Author     : pitpr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String name="homename";%>
        <%for (int i=0; i<5;i++){ %>
        <h1>Hello <% out.println(name);%> !</h1>
        <h2> <%=name%> </h2>
        
        <%} %>
    </body>
</html>
