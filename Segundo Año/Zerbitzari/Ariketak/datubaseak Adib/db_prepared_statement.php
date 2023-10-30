<?php
    $serverName="localhost";
    //lokalean dagoen mysql-ra konektatzeko defektuzko erabiltzailea
    // root da eta pasahitza hutsik doa
    $user="root";
    $pass="";
    // datu basearen izena esan behar da
    $database="cifpsanjorge";

    //sortu konexioa
    $conn = new mysqli ($serverName,$user, $pass, $database);
    
    //konprobatu konexioa
    if ($conn->connect_error) {
        die("Ezin izan da konexioa egin");
    }
    echo "konexioa eginda <br>";

    //kontsulta prestatu
    // prepare and bind
    $stmt = $conn->prepare("INSERT INTO ikasgaiak (izena, deskribapena) VALUES (?, ?)");
    $izena="DAW";
    $deskribapena="Web aplikazioen garapena";
    $stmt->bind_param("ss", $izena, $deskribapena);
    $stmt->execute();

    echo "Datuak gordeta";

    $stmt->close();
    $conn->close();
?>