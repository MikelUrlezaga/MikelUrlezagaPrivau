fetch('json.json')
    .then(response => {
        if (!response.ok) {
            throw new Error('Error de red o no se encontró el recurso');
        }
        return response.json();
    })
    .then(data => {
        // Trabajar con el objeto JavaScript resultante
        console.log(data);
    })
    .catch(error => {
        console.error('Hubo un problema con la solicitud: ', error);
    });