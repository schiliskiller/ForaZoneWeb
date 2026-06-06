// Me apoye con la IA para generar este script
function sendEstJsonData() {
    let correo_ver = document.getElementById('correoVerificacion').value;
    let terminos = document.getElementById('flexCheckDefault').checked;

    const data = {
        type: "estudiante",
        nombreUsuario: document.getElementById('nombreUsuarioDuenio').value,
        fechaNacimiento: document.getElementById('fechaNacimientoDuenio').value,
        correoInstitucional: document.getElementById('correoCuentaNueva').value,
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

    if (correo_ver !== data.correoInstitucional)
    {
        alert('Verificacion de correo no exitoso');
        return;
    }

    fetch('/usr', {
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

function sendDuenioJsonData() {
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

    if (!data.correoInstitucional.includes("@"))
    {
        alert('Correo incorrecto');
        return;
    }

    if (correo_ver !== data.correoElectronico)
    {
        alert('Verificacion de correo no exitoso');
        return;
    }

    fetch('/usr', {
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

function sendViviendaJsonData() {
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
            window.location.href = '/';
        });
}
