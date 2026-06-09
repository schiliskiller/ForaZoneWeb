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
    // 1. Evitamos que el navegador recargue la página
    event.preventDefault();

    // 2. Extraemos todos los datos de los inputs
    const form = document.getElementById("form-nueva-vivienda");
    const formData = new FormData(form);

    // Leemos los campos de texto de las coordenadas
    const lat = parseFloat(document.getElementById('nueva-latitud').value);
    const lng = parseFloat(document.getElementById('nueva-longitud').value);

    // Validamos rápido que sí hayan seleccionado un punto en el mapa
    if (isNaN(lat) || !lng) {
        alert("Por favor, selecciona la ubicación del alojamiento haciendo clic en el mapa.");
        return;
    }

    // 3. Construimos el esqueleto principal del JSON
    const viviendaJSON = {
        type: formData.get('tipo'),
        precio: parseFloat(formData.get('precio')),
        descripcion: formData.get('descripcion'),
        ratingTotal: 0,
        geopunto: [lng, lat],
        duenioId: null,
        // Creamos el sub-objeto de la dirección tal como lo espera MongoDB
        direccion: {
            colonia: formData.get('direccion.colonia'),
            calle: formData.get('direccion.calle'),
            numExt: formData.get('direccion.numExt'),
            numInt: formData.get('direccion.numInt'),
            codPostal: parseInt(formData.get('direccion.codPostal')),
            ciudad: formData.get('direccion.calle')
        }
    };

    // 4. Inyectamos solo los atributos del tipo que se seleccionó
    if (viviendaJSON.type === 'departamento') {
        viviendaJSON.numeroHabitaciones = parseInt(formData.get('numeroHabitaciones'));
        viviendaJSON.cuotaMantenimiento = parseFloat(formData.get('cuotaMantenimiento'));
    }
    else if (viviendaJSON.type === 'pension') {
        // Los checkboxes de HTML envían su valor si están marcados, o null si no lo están
        viviendaJSON.incluyeAlimentos = formData.get('incluyeAlimentos') === 'true';
        viviendaJSON.numeroComidasAlDia = parseInt(formData.get('numeroComidasAlDia'));
    }
    else if (viviendaJSON.type === 'casa_compartida') {
        viviendaJSON.tienePatio = formData.get('tienePatio') === 'true';
        viviendaJSON.numeroPisos = parseInt(formData.get('numeroPisos'));
    }

    console.log(viviendaJSON);

    // 5. Enviamos el JSON a Spring Boot usando fetch
    fetch('/vivienda', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json' // 🛑 Súper importante avisarle que es JSON
        },
        body: JSON.stringify(viviendaJSON) // Convertimos el objeto JS a texto JSON
    })
    .then(response => {
        if (!response.ok) throw new Error('Error al guardar en la base de datos');

        // Si todo sale chido, limpiamos el formulario
        form.reset();

        // Removemos el pin temporal del mapa para que no se quede ahí flotando
        if (marcadorTemporal) {
            mapa.removeLayer(marcadorTemporal);
            marcadorTemporal = null;
        }

        // Cerramos el modal de Bootstrap
        bootstrap.Modal.getInstance(document.getElementById('modalNuevaVivienda')).hide();

        // Volvemos a pedir la lista a MongoDB para que el nuevo pin aparezca al instante
        cargarViviendas();
    })
    .catch(error => {
        console.error("Hubo un problema:", error);
        alert("No se pudo guardar el alojamiento. Revisa la consola.");
    });
}
