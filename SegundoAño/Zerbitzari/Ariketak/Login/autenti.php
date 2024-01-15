<?php
if (!isset($_SERVER['PHP_AUTH_USER'])) {
    header('WWW-Authenticate: Basic realm="Área restringida"');
    header('HTTP/1.0 401 Unauthorized');
    echo 'Orri honetara sartzeko autentikazioa beharrezkoa da.';
    exit;
}
else {

    $usuario = $_SERVER['PHP_AUTH_USER'];
    $contrasena = $_SERVER['PHP_AUTH_PW'];
    
    echo "Ongi Etorri";
}
?>
