<!DOCTYPE html>
<html>
    <head>
        <title> </title>
    </head>
    <body>
        <h1>Ariketa1</h1>
        <?php

        $frutas = array("limón", "naranja", "banana", "albaricoque");
        sort($frutas);
        foreach ($frutas as $clave => $valor) {
            echo "frutas[" . $clave . "] = " . $valor . "\n";
        }

        ?>
    </body>
</html>