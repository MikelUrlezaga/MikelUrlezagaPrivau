// Datos que deseas enviar
const dataToSend = {
    key1: 'valor1',
    key2: 'valor2',
  };
  
  // Configurar las opciones para la solicitud Fetch
  const requestOptions = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json', // Asegura que estás enviando JSON
    },
    body: JSON.stringify(dataToSend), // Convierte los datos a JSON
  };
  
  // Hacer la solicitud Fetch a tu archivo PHP
  fetch('tuarchivo.php', requestOptions)
    .then(response => response.json())
    .then(data => {
      console.log(data); // Datos recibidos desde PHP
    })
    .catch(error => {
      console.error('Error:', error);
    });
  