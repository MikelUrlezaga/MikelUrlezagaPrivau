<?php
header('Content-Type: application/json');

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nombre = $_POST['nombre'];

    // Conectar a la base de datos MySQL
    $conexion = new mysqli("localhost", "usuario", "contraseña", "nombres");

    if ($conexion->connect_error) {
        echo json_encode(array("success" => false));
        die("Conexión a la base de datos fallida: " . $conexion->connect_error);
    }

    // Insertar el nombre en la base de datos
    $sql = "INSERT INTO lista (nombre) VALUES ('$nombre')";
    if ($conexion->query($sql) === TRUE) {
        echo json_encode(array("success" => true));
    } else {
        echo json_encode(array("success" => false));
    }

    $conexion->close();
} else {
    echo json_encode(array("success" => false, "message" => "Método no permitido"));
}
?>
