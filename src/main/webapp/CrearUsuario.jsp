<%@ page import="models.TipoUsuario" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Crear Usuario</title>
</head>
<body>

<%@include file="MenuNav.jsp" %>

<%
    session = request.getSession();
    if(session.getAttribute("nombre")!=null && session.getAttribute("pass")!=null){
%>

<div class = "container my-3">
    <div class="text-center my-5">
        <h2>
            Formulario para Crear Usuario
        </h2>
    </div>
    <form action="CrearUsuario" method="POST">
        <div class="mb-3 row">
            <label for="nombre" class="col-sm-2 col-form-label">Nombre Usuario</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
        </div>
        <div class="mb-3 row">
            <label for="contrasenia" class="col-sm-2 col-form-label">Contraseña</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="contrasenia" name="contrasenia" required>
            </div>
        </div>
        <div class="mb-3 row">
            <label for="tipoUsuario" class="col-sm-2 col-form-label">Tipo</label>
            <div class="col-sm-10">
                <select class="form-select" id="tipoUsuario" name="tipoUsuario" required>
                    <option value="<%= TipoUsuario.Cliente%>">Cliente</option>
                    <option value="<%= TipoUsuario.Administrativo%>">Administrativo</option>
                    <option value="<%= TipoUsuario.Profesional%>">Profesional</option>
                </select>
            </div>

        </div>

        <button type="submit" class="btn btn-primary" onclick="mostrarMensaje()">Enviar</button>
    </form>
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

<script>
    function mostrarMensaje(){
        alert("Datos enviados con éxito")
    }
</script>

</body>
</html>
