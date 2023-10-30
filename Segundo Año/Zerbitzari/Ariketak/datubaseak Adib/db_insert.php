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
    echo "konexioa eginda";

    //kontsulta sortu
    $sql="INSERT INTO ikasgaiak (izena, deskribapena) VALUES ('DIW','html eta css lantzeko')";
    //kontsulta exekutatu eta konprobatu ondo egin duen
    if ($conn->query($sql) == TRUE)
        echo "lerroa txertatuta";
    else
        echo "Errorea: ".$sql."<br>".$conn->error;
    
    $conn->close();
?>