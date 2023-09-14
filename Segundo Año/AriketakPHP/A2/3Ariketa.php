<!DOCTYPE html>
<html>
    <body>
        <h1>Zenbaki Random</h1>
        <?php
            // Aldagaia sortuko dugu eta rand() erabilita ausazko balore bat lortuko da emandako tartean 0 izanda min eta 30 max
            $zenbakia = rand(0,30);

            // if/elseif bat erabiliko da tarte desberdinetan desberdintzeko eta hauek erakusteko

            if ($zenbakia < 11) {
                echo "0-tik 10-era dago";
            }
            elseif ($zenbakia < 21) {
                echo "11-tik 20-ra dago";
            }
            else {
                echo "21-etik 30-era dago";
            }
        ?>
    </body>
</html>