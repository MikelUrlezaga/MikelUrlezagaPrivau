<?php
// Recoge los datos enviados por JavaScript
$data = json_decode(file_get_contents('php://input'), true);

if ($data) {
  // Haz algo con los datos, por ejemplo, puedes imprimirlos
  echo json_encode($data);
} else {
  echo json_encode(array('error' => 'No se recibieron datos.'));
}
?>