<!DOCTYPE html>
<html>
    <body>
        <h1>My first PHP page</h1>
        <?php
        //declare(strict_types=1);

        // Resto de tu código aquí

        function mezua() {
            echo "Kaixo Mundua!";
            echo "</br>";
        }

        mezua(); // Llama a la función mezua

        function familyName($fname) {
            echo "$fname Refsnes.<br>";
        }

        familyName("Jani");
        familyName("Hege");
        familyName("Stale");
        familyName("Kai Jim");
        familyName("Borge");

        echo "</br>";

        function addNumbers($a, $b) {
            return $a + $b;
        }

        echo addNumbers(5, 5);
        ?>
    </body>
</html>