// URL del servidor que contiene los datos JSON
const url = 'https://ejemplo.com/api/datos';

// Hacer una solicitud GET utilizando Fetch
fetch(url)
    .then(response => {
        // Verificar si la solicitud fue exitosa (código de estado 200)
        if (response.status === 200) {
            // Convertir la respuesta a JSON
            return response.json();
        } else {
            throw new Error('Error en la solicitud');
        }
    })
    .then(data => {
        // Hacer algo con los datos JSON recibidos, por ejemplo, mostrarlos en la consola
        console.log(data);
    })
    .catch(error => {
        // Manejar errores, por ejemplo, mostrar un mensaje de error en la consola
        console.error('Hubo un error: ' + error);
    });
