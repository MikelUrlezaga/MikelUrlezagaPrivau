<!DOCTYPE html>
<html>
    <body>
        <h1>2Ariketa</h1>
        <?php
            $array = array("EH", "Frantzia", "Alemania", "Italia");
            sort($array);
            foreach ($array as $valor) {
                echo $valor;
                echo " ";
            }
        ?>
    </body>
</html>