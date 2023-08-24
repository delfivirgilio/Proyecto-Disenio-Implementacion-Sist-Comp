

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud recibida</title>
    </head>
    <body>
        <h1>Solicitud Recibida</h1>
        <h2>Tus datos son:</h2>
        <%
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String correo= request.getParameter("correo");
        String genero=request.getParameter("genero");
        %>
        <table border="1" cellspacing="3" cellpadding="3">
            <tr>
                <td>Nombre:</td>
                <td><%= nombre %></td>
            </tr>
            <tr>
                <td>Apellido:</td>
                <td><%= apellido %></td>
            </tr>
            <tr>
                <td>Correo:</td>
                <td><%= correo %></td>
            </tr>
            <tr>
                <td>Eres:</td>
                <td><%= genero %></td>
            </tr>
        </table><br>
        <%
        String java= request.getParameter("java");
        String c= request.getParameter("c");
        String html= request.getParameter("html");
        String basic= request.getParameter("basic");
        %>
        <label>Conoces los siguientes lenguajes de programacion:</label><br>
        <div>
        <% if(java!=null) {%>
        <p><%= java %>,</p>
        <%}%>
        <% if(c!=null) {%>
        <p><%= c %>,</p>
        <%}%>
        <% if(html!=null) {%>
        <p><%= html %>,</p>
        <%}%>
        <% if(basic!=null) {%>
        <p><%= basic %></p>
        <%}%> 
        </div><br>
        <%String idiomas[]=request.getParameterValues("idiomas"); %>
        <label>Los idiomas que comprendes son:</label><br>
        <% for(int i=0; i<idiomas.length; i++){%>
        <p><%=idiomas[i]%></p><br>
            <%}%>
        <%
         String comentarios=request.getParameter("comentarios");
        %> 
        <label>Comentarios adicionales:</label><br>
        <p><%=comentarios%></p><br>
        <a href="index1.jsp">Regresar</a>
            
            
        
    </body>
</html>
