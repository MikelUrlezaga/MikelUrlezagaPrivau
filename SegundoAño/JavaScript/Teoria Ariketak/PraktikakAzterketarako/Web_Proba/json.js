const jsonString = '{"nombre": "John", "edad": 30, "ciudad": "Ejemplo"}';

try {
    const objetoJSON = JSON.parse(jsonString);
    console.log(objetoJSON);
} catch (error) {
    console.error('Error al analizar el JSON: ', error);
}