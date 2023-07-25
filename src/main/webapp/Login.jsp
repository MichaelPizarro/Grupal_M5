<%@page language="java" pageEncoding="UTF-8"%>

<html>
       <head>
              <meta charset="UTF-8">
              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
              <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
              <link rel="stylesheet" type="text/css" href="./css/stylesLogin.css">
              <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">

              <title> Login </title>
       </head>
       <body>

       <%@include file="InicioLoginNav.jsp" %>
       <div class="form-bg">
              <div class="container">
                     <div class="row">
                            <div class="col-lg-12 col-md-8 mt-5">
                                   <div class="form-container">
                                          <div class="form-icon">
                                                 <i class="fa fa-user-circle"></i>
                                                 <span class="registrate"><a href="">No tienes cuenta? Registrate</a></span>
                                          </div>
                                          <form class="form-horizontal" action="Login" method="POST">
                                                 <h3 class="title">Ingresar usuario</h3>
                                                 <div class="form-group">
                                                        <span class="input-icon"><i class="fa fa-envelope"></i></span>
                                                        <input class="form-control" type="text" name="nombre" placeholder="Usuario" required>
                                                 </div>
                                                 <div class="form-group">
                                                        <span class="input-icon"><i class="fa fa-lock"></i></span>
                                                        <input class="form-control" type="password" name="pass" placeholder="Contraseña" required>
                                                 </div>
                                                 <button class="btn btn-primary signin" type="submit">Enviar</button>
                                          </form>
                                   </div>
                            </div>
                     </div>
              </div>
       </div>

       <div class="container my-5">
              <%@include file="Footer.jsp" %>
       </div>

       </body>
       </html>

