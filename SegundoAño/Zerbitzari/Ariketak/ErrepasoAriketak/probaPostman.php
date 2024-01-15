<?php
// Comprueba si se proporciona el parámetro "nombre" en la URL
if (isset($_GET['nombre'])) {
    // Recupera el valor del parámetro
    $nombre = $_GET['nombre'];
    
    // Crea un arreglo asociativo con el valor del nombre
    $response = [
        'nombre' => $nombre
    ];

    // Devuelve la respuesta en formato JSON
    header('Content-Type: application/json');
    echo json_encode($response);
} else {
    // Si no se proporciona el parámetro, devuelve un mensaje de error
    header("HTTP/1.1 400 Bad Request");
    echo json_encode(['error' => 'El parámetro "nombre" no se proporcionó en la URL']);
}
?>
