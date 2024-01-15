<?php
    $array = array (1=>"kaixo", 2=>"mundua");
    if ($_SERVER["REQUEST_METHOD"]=="GET"){
        header("Content-Type: application/json");
        echo json_encode($array);
    }elseif($_SERVER["REQUEST_METHOD"]=="POST"){
        $aux=json_decode(file_get_contents('php://input'), true);
        echo "entra post2";
        //$aux=json_decode($_POST["froga"]);
            
            echo "esto es una prueba, y he recibido por POST: ".$aux["x"];
    }else{
        echo "ni por get ni por post";
    }
?>