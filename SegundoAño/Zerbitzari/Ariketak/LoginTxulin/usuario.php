<?php
    echo $_GET["Usuario"];
    echo "<br>";
    echo $_GET["Password"];
    $usuario = $_GET["Usuario"];
    $pass = $_GET["Password"];

    $hashPass = password_hash($pass, PASSWORD_BCRYPT);
    echo $hashPass;
    meterUsuario($usuario,$hashPass);

    function meterUsuario($usuario,$hashPass){
        $servername ="localhost";
        $user ="root";
        $pass ="";
        $dbname ="login";
        $conn = new mysqli($servername,$user,$pass,$dbname);
        $sql = "INSERT INTO usuarios (Usuario,Pass) VALUES ('".$usuario."','".$hashPass."')";
        $conn->query ($sql);
    }
?>