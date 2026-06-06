<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>ForaZone - Crear cuenta</title>
        <link rel="stylesheet" href="/style/bootstrap.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="/js/send_json.js"></script>
    </head>
    <body>
        <form id="signupForm">
            <legend>Por favor ingrese los siguientes datos</legend>
            <fieldset>
                <div>
                    <label for="nombreUsuarioEst" class="form-label mt-4">Nombre de usuario</label>
                    <input type="text" class="form-control" id="nombreUsuarioEst">
                </div>
                <div>
                    <label for="fechaNacimientoEst" class="form-label mt-4">Fecha de nacimiento</label>
                    <input type="date" class="form-control" id="fechaNacimientoEst" placeholder="dd/mm/aa">
                </div>
                <div>
                    <label for="correoInstitucional" class="form-label mt-4">Correo electrónico</label>
                    <input type="email" class="form-control" id="correoInstitucional" placeholder="abcdxyz@universidad.com">
                </div>
                <div>
                    <label for="contraCuentaNueva" class="form-label mt-4">Contraseña</label>
                    <input type="password" class="form-control" id="contraCuentaNueva" placeholder="********" autocomplete="off">
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                    <label class="form-check-label" for="flexCheckDefault">
                        Esta de acuerdo con nuestro <a href="#">aviso de privacidad</a>.
                    </label>
                </div>
                <button type="button" class="btn btn-primary" onclick="sendEstJsonData()">Submit</button>
            </fieldset>
        </form>
    </body>
</html>