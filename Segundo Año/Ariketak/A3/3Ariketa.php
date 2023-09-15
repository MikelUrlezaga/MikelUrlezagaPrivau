<!DOCTYPE html>
<html>
    <body>
        <h1>3Ariketa</h1>
        <?php
            //Aldagaiak sortu, hasierako zenbakia eta multiplikadorearentzako
            $zenbakia = 0;
            $a = 1;
            do {
                //do while bat, zenbakia aldagaia 30 baina txikiagoa denean, berriro gehitzen duena
                $zenbakia = $zenbakia + 3*$a;
                echo $zenbakia;
                echo " ";
                $a++;
            } while ($zenbakia < 30);
        ?>
    </body>
</html>