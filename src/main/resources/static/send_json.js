// Me apoye con la IA para generar este script
function sendEstJsonData() {
    event.preventDefault();

    let terminos = document.getElementById('flexCheckDefault').checked;

    const data = {
        type: "estudiante",
        nombreUsuario: document.getElementById('nombreUsuarioEst').value,
        fechaNacimiento: document.getElementById('fechaNacimientoEst').value,
        correoInstitucional: document.getElementById('correoInstitucional').value,
        contrEncriptada: document.getElementById('contraCuentaNueva').value,
        token: null
    };

    if (!terminos)
    {
        alert('Tienes que aceptar los terminos y condiciones');
        return;
    }

    if (!data.correoInstitucional.includes("@"))
    {
        alert('Correo incorrecto');
        return;
    }

    fetch('http://localhost:8080/usuario', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json' // Tells Spring Boot to look for JSON
        },
        body: JSON.stringify(data) // Sends the payload as a stringified request body
    })
        .then(response => {
            console.log('antes');
            response.json();
            console.log('despues');
        })
        .then(data => {
            console.log('Success:', data);
            window.location.href = '/';
        });
}

function sendDuenioJsonData() {
    event.preventDefault();

    let correo_ver = document.getElementById('correoVerificacion').value;
    let terminos = document.getElementById('flexCheckDefault').checked;

    const data = {
        type: "duenio",
        nombre: document.getElementById('nombreDuenio').value,
        apPat: document.getElementById('apPatDuenio').value,
        apMat: document.getElementById('apMatDuenio').value,
        fechaNacimiento: document.getElementById('fechaNacimientoDuenio').value,
        nombreUsuario: document.getElementById('nombreUsuarioDuenio').value,
        correoElectronico: document.getElementById('correoCuentaNueva').value,
        contrEncriptada: document.getElementById('contraCuentaNueva').value,
        reputacion: 0
    };

    if (!terminos)
    {
        alert('Tienes que aceptar los terminos y condiciones');
        return;
    }

    if (!data.correoElectronico.includes("@"))
    {
        alert('Correo incorrecto');
        return;
    }

    if (correo_ver !== data.correoElectronico)
    {
        alert('Verificacion de correo no exitoso');
        return;
    }

    fetch('/usuario', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json' // Tells Spring Boot to look for JSON
        },
        body: JSON.stringify(data) // Sends the payload as a stringified request body
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            window.location.href = '/';
        });
}

function sendLoginJsonData() {
    event.preventDefault();

    let campoCorreoNombre = document.getElementById("nombreUsuario").value

    const data = {
        type: "duenio",
        nombreUsuario: !campoCorreoNombre.includes("@")
                        ? campoCorreoNombre
                        : null,
        correoElectronico: !campoCorreoNombre.includes("@")
                            ? null
                            : campoCorreoNombre,
        contrEncriptada: document.getElementById('contrasena').value
    };


    fetch('/usuario/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json' // Tells Spring Boot to look for JSON
        },
        body: JSON.stringify(data) // Sends the payload as a stringified request body
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            window.location.href = '/homepage';
        });
}

function sendViviendaJsonData() {
    event.preventDefault();
    const data = {
        type: document.getElementById("").value,

    };

    fetch('/vivienda', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json' // Tells Spring Boot to look for JSON
        },
        body: JSON.stringify(data) // Sends the payload as a stringified request body
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            window.location.href = '../../webapp';
        });
}

// function sendComentarioJsonData() {
//     event.preventDefault();
//     const data = {
//         viviendaId:
//     };
//
//     fetch('/vivienda', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json' // Tells Spring Boot to look for JSON
//         },
//         body: JSON.stringify(data) // Sends the payload as a stringified request body
//     })
//         .then(response => response.json())
//         .then(data => {
//             console.log('Success:', data);
//             window.location.href = '../../webapp';
//         });
// }
