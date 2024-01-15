<?php
    $serverName="localhost";
    //lokalean dagoen mysql-ra konektatzeko defektuzko erabiltzailea
    // root da eta pasahitza hutsik doa
    $user="root";
    $pass="";

    //sortu konexioa
    $conn = new mysqli ($serverName,$user, $pass);
    
    //konprobatu konexioa
    if ($conn->connect_error) {
        die("Ezin izan da konexioa egin");
    }
    echo "konexioa eginda";
    $conn->close();
?>