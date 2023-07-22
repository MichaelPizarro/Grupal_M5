<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Contacto</title>
</head>
<body>

<%@include file="MenuNav.jsp" %>

<div class = "container my-3">
    <div class="text-center my-5">
        <h2>
            Formulario de Contacto
        </h2>
    </div>
    <form action = "Contacto" method = "POST">
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre</label>
            <input type="text" class="form-control" id= "nombre" name="nombre" required>
        </div>
        <div class="mb-3">
            <label for="correo" class="form-label">Correo</label>
            <input type="email" class="form-control" id="correo" name="correo" required>
        </div>
        <div class="mb-3">
            <label for="comentario" class="form-label">Comentario</label>
            <textarea class="form-control" id="comentario" name="comentario" required>
    </textarea>
        </div>
        <button type="submit" class="btn btn-primary" onclick="mostrarMensaje()">Enviar</button>
    </form>
</div>

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

