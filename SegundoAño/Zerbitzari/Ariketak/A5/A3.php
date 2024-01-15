<!DOCTYPE html>
<html>
    <body>
        <h1>2Ariketa</h1>
            <table bgcolor="red">
                <?php

                    $gehitura = 0;
                    $array = array(array("ikaslea" => "Jon", "nota" => 8) ,array("ikaslea" => "Ane", "nota" => 6), array("ikaslea" => "Markel", "nota" => 3));
                    foreach ($array as $key) {?>
                        <tr bgcolor="white">
                        <?php
                        $noiz = 0;
                        foreach ($key as $value) {
                            $noiz++;
                            echo "<td>$value</td>";
                            if ($noiz%2 == 0) {
                                if ($value < 5) {
                                    echo "<td>Txarra</td>";
                                }
                                if ($value > 5 && $value <7) {
                                    echo "<td>Ona</td>";
                                }
                                if ($value > 7) {
                                    echo "<td>Oso Ona</td>";
                                }
                                echo "</tr>";
                            }
                        }
                    }

                ?>
            </table>
    </body>
</html>