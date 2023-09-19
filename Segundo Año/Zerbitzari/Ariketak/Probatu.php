<!DOCTYPE html>
<html>
    <body>
        <h1>My first PHP page</h1>
        <?php
            $age = array("Peter", "Ben"=>"37", "Joe"=>"43");

            foreach($age as $x => $x_value) {
            echo "Key=" . $x . ", Value=" . $x_value;
            echo "<br>";
            }
        ?>
    </body>
</html>
