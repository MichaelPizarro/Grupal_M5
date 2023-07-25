<%@ page import="models.Capacitacion" %>
<%@ page import="java.util.List" %>
<%@ page import="models.Usuario" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Lista de Usuarios</title>
</head>
<body>

<%@include file="MenuNav.jsp" %>

<%
    session = request.getSession();
    if(session.getAttribute("nombre")!=null && session.getAttribute("pass")!=null){
        %>

<div class="text-center my-5">
    <h2>
        Lista de Usuarios
    </h2>
</div>

<div class="table-container d-flex justify-content-center align-items-center">
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nombre</th>
            <th scope="col">Tipo de Usuario</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Usuario> usuarios = (List<Usuario>) request.getAttribute("listaUsuarios");
            if(usuarios != null && !usuarios.isEmpty()) {
                for (Usuario u : usuarios) {
        %>
        <tr>
            <td><%= u.getId()%></td>
            <td><%= u.getNombre()%></td>
            <td><%= u.getTipo()%></td>
        </tr>
        <% }
        } else {
        %>
        <tr>
            <td colspan="7" class="text-center">
                <h3>No hay usuarios</h3>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
<%
    }
    else{
        response.sendRedirect("Login.jsp");
    }
%>

<div class="container my-5">
    <%@include file="Footer.jsp" %>
</div>

</body>
</html>

