<%@page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Archivo+Black&display=swap">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
    <title>Inicio</title>

</head>
<body>

<%@include file="InicioLoginNav.jsp" %>

<div class="container my-5">
    <h1 class="display-4 text-center text-dark custom-title">Capacitaciones Administrativas</h1>
</div>
<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="https://www.centralweb.cl/wp-content/uploads/2021/12/cuatro_tendencias_en_materia_de_capacitacion_y_reclutamiento_que_marcaran_el_2022_1-scaled.jpg" class="d-block w-100" alt="Capacitacion 1">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="text-dark">Capacitaciones</h2>
                <h3 class="text-dark">Somos la mejor alternativa para tu negocio</h3>
            </div>
        </div>
        <div class="carousel-item">
            <img src="https://aab0d21b5d.clvaw-cdnwnd.com/2a9fe15de24381b8ac1a2474f5192529/200000006-7135e71360/WorkTeamMeeting_000041876160_Large_1920x1080.jpg?ph=aab0d21b5d" class="d-block w-100" alt="Capacitacion 3">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="text-dark">Capacitaciones</h2>
                <h3 class="text-dark">Impulsa tu negocio y a tus trabajadores</h3>
            </div>
        </div>
        <div class="carousel-item">
            <img src="https://gestionglobalcapacita.cl/ogloalyx/2021/03/habilidades-transversales.jpg" class="d-block w-100" alt="Capacitacion 3">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="text-dark">Capacitaciones</h2>
                <h3 class="text-dark">Tu empresa crece junto a nosotros</h3>
            </div>
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>

<div class="container my-5">
    <%@include file="Footer.jsp" %>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>


</body>
</html>