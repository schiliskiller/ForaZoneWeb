<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>ForaZone - Página principal</title>
        <link rel="stylesheet" href="bootstrap.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-danger" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>ForaZone</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarColor01">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Inicio
                                <span class="visually-hidden">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Departamentos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Mapa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Nosotros</a>
                        </li>
                    </ul>
                    <div class="d-flex">
                        <a href="/beforeSignup" class="btn btn-primary">Crear cuenta</a>
<!--                        <button type="button" class="btn btn-primary">Crear cuenta</button>-->
                        <a href="/login" class="btn btn-secondary">Iniciar sesion</a>
                    </div>
                </div>
            </div>
        </nav>
        <div id="homepage-paragraph">
            <h1>Un lugar seguro para estudiantes</h1>

            <p>
                Este proyecto busca fomentar la seguridad y la comodidad del estudiante foraneos
            </p>
        </div>
    </body>
</html>
