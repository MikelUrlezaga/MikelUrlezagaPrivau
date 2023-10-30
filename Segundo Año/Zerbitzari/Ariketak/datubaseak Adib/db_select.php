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

    $sql = "SELECT izena, deskribapena FROM ikasgaiak";
    $result = $conn->query($sql);

    //begiratu lortutako lerro kopurua
    if ($result->num_rows > 0) {
        // output data of each row
        while($lerroa = $result->fetch_assoc()) {
          echo "izena: " . $lerroa["izena"]. " - Deskribapena: " . $lerroa["deskribapena"]. "<br>";
        }
      } else {
        echo "0 results";
      }
    $conn->close();

?>