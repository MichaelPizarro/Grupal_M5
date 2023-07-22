<%@ page import="models.Capacitacion" %>
<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Lista de Capacitaciones</title>
</head>
<body>

<%@include file="MenuNav.jsp" %>

<div class="text-center my-5">
    <h2>
        Lista de Capacitaciones
    </h2>
</div>

<div class="table-container d-flex justify-content-center align-items-center">
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Rut Cliente</th>
            <th scope="col">Dia</th>
            <th scope="col">Hora</th>
            <th scope="col">Lugar</th>
            <th scope="col">Duración</th>
            <th scope="col">Cantidad de Asistentes</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Capacitacion> capacitaciones = (List<Capacitacion>) request.getAttribute("listaCapacitaciones");
            if(capacitaciones != null && !capacitaciones.isEmpty()) {
                for (Capacitacion c : capacitaciones) {
        %>
        <tr>
            <td><%= c.getIdentificador()%></td>
            <td><%= c.getRutCliente()%></td>
            <td><%= c.getDia()%></td>
            <td><%= c.getHora()%></td>
            <td><%= c.getLugar()%></td>
            <td><%= c.getDuracion()%></td>
            <td><%= c.getCantAsistentes()%></td>
        </tr>
        <% }
        } else {
        %>
        <tr>
            <td colspan="7" class="text-center">
                <h3>No hay capacitaciones</h3>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

<div class="container my-5">
    <%@include file="Footer.jsp" %>
</div>

</body>
</html>

