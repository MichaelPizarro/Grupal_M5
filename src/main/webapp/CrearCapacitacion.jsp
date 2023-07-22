<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Crear Capacitacion</title>
</head>
<body>

<%@include file="MenuNav.jsp" %>

<%
    session = request.getSession();
    if(session.getAttribute("usuario")!=null && session.getAttribute("pass")!=null){
%>

<div class = "container my-3">
    <div class="text-center my-5">
        <h2>
            Formulario para Crear Capacitación
        </h2>
    </div>
    <form action="CrearCapacitacion" method="POST">
        <div class="mb-3 row">
            <label for="rutCliente" class="col-sm-2 col-form-label">Rut Cliente</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="rutCliente" name="rutCliente" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="dia" class="col-sm-2 col-form-label">Dia</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="dia" name="dia" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="hora" class="col-sm-2 col-form-label">Hora</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="hora" name="hora" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="lugar" class="col-sm-2 col-form-label">Lugar</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="lugar" name="lugar" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="duracion" class="col-sm-2 col-form-label">Duración</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="duracion" name="duracion" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="cantAsistentes" class="col-sm-2 col-form-label">Cantidad Asistentes</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="cantAsistentes" name="cantAsistentes" required>
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
