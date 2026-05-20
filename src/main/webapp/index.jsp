<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
    <head>
        <title>ForaZone - Página Principal</title>
        <meta charset="UTF-8">
<!--        <link rel="stylesheet" href="style/style.css">-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="center">
            <h1>ForaZone!</h1>
            <h2>Lugares buscados, no se jajaja</h2>

            <c:forEach var="v" items="${viviendas}">
                <p>${v}</p>
            </c:forEach>
        </div>
    </body>
</html>
