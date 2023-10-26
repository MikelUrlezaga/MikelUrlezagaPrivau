<!DOCTYPE html>
<html>
    <body>
        <h1>Ariketa 1</h1>
        <?php
            $Zenbaki = 5;
            echo $Zenbaki;
            echo "<br>";
            echo $Zenbaki;
            echo "<br>";
            //Un numero random


            $age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

            foreach($age as $x => $x_value) {
            echo "Key= " . $x . ", Value= " . $x_value;
            echo "<br>";
            }


        ?>
    </body>
</html>