<!DOCTYPE html>
<html>
    <body>
        <h1>5Ariketa</h1>
        <?php
            //bi for sortu, bat 1 etik 100 era egiteko eta bestea zenbakien zatiketak
            for ($a=2; $a < 100; $a++) { 
                //aldagai bat sortuko dugu, kontuan izateko zatiketen emaitza 0 denean balio hartzeko,eta hau 0 ra berdindu buelta bakoitzean
                $m = 0;
                for ($i=1; $i < ($a-2); $i++) { 
                    if ($a%($i+1) == 0) {
                        $m++;
                    }
                    else{}
                }
                //if bat erabiliko da zenbaki primoa ateratzeko pantailatik $m aldagaia baldintzatzen
                if ($m == 0) {
                        echo $a . " primoa da";
                        echo "<br>";
                }
            }
        ?>
    </body>
</html>