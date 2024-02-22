<%-- 
    Document   : verZodiaco
    Created on : 16-feb-2024, 16:26:48
    Author     : David
--%>

<%@page import="Principal.JspCalendar"%>
<%@page import="Principal.Jugador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Zodiaco</title>
        <link rel="stylesheet" href="CSS/verZodiaco.css">
    </head>
    <body>
        <div class="container">
            <h1>Datos</h1>
            <% 
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fecha = request.getParameter("fecha");
            String signo = JspCalendar.obtenerSignoZodiaco(fecha);
            String edad = JspCalendar.obtenerEdad(fecha);
            %>
            <ul>
                <li>
                    <label>Nombre: <%=nombre%></label>
                </li>
                <li>
                    <label>Apellido: <%=apellido%></label>
                </li>
                <li>
                    <label>Fecha: <%=fecha%></label>
                </li>
                <li>
                    <label>Signo del Zodiaco: <%=signo%></label>
                </li>
                <li>
                    <label>Edad: <%=edad%></label>
                </li>
            </ul>
        </div>
        <div class="btn-container">
            <button class="btn" onclick="goToIndex()">Volver</button>
        </div>
    <script>
        function goToIndex() {
            window.location.href = "index.html";
        }
    </script>
    </body>
</html>
