<?php
    function decode(){
            // $array=json_decode(file_get_contents(__DIR__.'/JSON.json'),true);
            if ($_SERVER["REQUEST_METHOD"]=="POST"){
            $array=json_decode(file_get_contents("php://input"),true);
            echo $array['nombre'];
            echo '<br>';
            echo $array ['descripcion'];
            echo '<br>';
            echo $array ['fecha_creacion'];
            echo '<br>';
            echo ($array ['activo'] ? 'Si' : 'No');
            echo '<br>';
            foreach ($array['valores'] as $value) {
                echo $value;
                echo '<br>';
            }
            foreach ($array['datos'] as $key => $value) {
                echo $key . ' : ' . $value;
                echo '<br>';
            }
        }
    }

    decode();
?>