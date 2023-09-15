<!DOCTYPE html>
<html>
    <body>
        <h1>4Ariketa</h1>
        <?php
            //array-a sortu eta baloreak sartu
            $herrialdeak = array("EH", "Frantzia", "Alemania", "Italia");
            //foreach bat erabili barruko elementuak erakusteko
            foreach($herrialdeak as $valor){
                echo $valor;
                echo " ";
            }
        ?>
    </body>
</html>