<!DOCTYPE html>
<html>
    <body>
        <h1>1Ariketa</h1>
        <?php
            //Lehenengo aldagai desberdinak sortuko dira, zenbaki hausazko bat hasierarako, baldintzarako a eta gehitura gordetzeko beste bat
            $zenbakia = rand(0,50);
            $a = 1;
            $gehitura = rand(0,50);
            echo $gehitura;
            echo " ";

            while ($a <= 9) {
                //while honek, gehituran gordetzen ditu aurreko baloreak eta zenbaki hausazko berriaren gehitura, gero erakusten du
                $gehitura = $gehitura + $zenbakia;
                $zenbakia = rand(0,50);
                echo $gehitura;
                echo " ";
                $a++;
            }
        ?>
    </body>
</html>