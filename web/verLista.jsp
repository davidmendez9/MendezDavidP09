<%-- 
    Document   : verLista
    Created on : 16-feb-2024, 16:27:19
    Author     : David
--%>

<%@page import="Principal.Jugador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista</title>
    <link rel="stylesheet" href="CSS/verLista.css">
</head>
<body>
    <h1>Lista de Jugadores de fútbol</h1>
    
    <section>
        <% List<Jugador> listaJugadores = Jugador.obtenerListaJugadores(); %>
        <% for (Jugador jugador : listaJugadores) { %>
            <article>
                <h3><%= jugador.getNombre() %></h3>
                <p>Nombre: <%= jugador.getNombre() %></p>
                <p>País: <%= jugador.getPais() %></p>
                <p>Posición: <%= jugador.getPosicion() %></p>
                <p>Goles: <%= jugador.getGoles() %></p>
            </article>
        <% } %>
    </section>
    <h1>Máximos goleadores por país</h1>
    <section>
        <% List<Jugador> maximosGoleadores = Jugador.obtenerMaximosGoleadores(); %>
        <% for (Jugador jugador : maximosGoleadores) { %>
            <article>
                <h3><%=jugador.getPais()%></h3>
                <h4><%= jugador.getNombre() %></h4>
                <p>Nombre: <%= jugador.getNombre() %></p>
                <p>Posición: <%= jugador.getPosicion() %></p>
                <p>Goles: <%= jugador.getGoles() %></p>
            </article>
        <% } %>
    </section>
    
    <a href="index.html">Volver</a>
</body>
</html>
