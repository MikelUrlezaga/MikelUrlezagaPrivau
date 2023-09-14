<!DOCTYPE html>
<html>
    <body>
        <h1>2Ariketa</h1>
        <?php
            //Aldagaia sortu, kasu honetan hasierako balorea izateko
            $zenbakia = 1;
            for ($i=1; $i < 6; $i++) { 
                //for bat erabiliko dugu biderketak gordetzeko eta gero erakusteko
                $zenbakia = $zenbakia * $i;
                echo $zenbakia;
                echo " ";
            }
        ?>
    </body>
</html>