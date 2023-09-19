<!DOCTYPE html>
<html>
<body>
    <h2>4Ariketa</h2>
    <table bgcolor="red">

        <?php

        $arrayIkasle = array("Mikel",array("Urlezaga","Pascual"),688629732,23);

        for ($i=0; $i < count($arrayIkasle); $i++) {?>
            <tr bgcolor="white">
            <?php
            if ($i == 1) {
                echo "<td>";
                for ($a=0; $a < 2; $a++) {
                    echo $arrayIkasle[1][$a];
                    echo " ";
                }
                echo "</td>";
                continue;
            }
            else {
                echo "<td>$arrayIkasle[$i]</td>";
            }
        }

        ?>
    </table>
    <hr>
    <table bgcolor="red">

        <?php

        $arrayIkasle = array("Mikel",array("Urlezaga","Pascual"),array(123,456),array(HEDATZEA,5,GARAPEN,5,BEZERO,5,ZERBITZARI,5,INTERFAZE,5));

        for ($i=0; $i < count($arrayIkasle); $i++) {?>
            <tr bgcolor="white">
            <?php
            if ($i == 1 || $i == 2) {
                echo "<td>";
                for ($a=0; $a < 2; $a++) {
                    echo $arrayIkasle[$i][$a];
                    echo " ";
                }
                echo "</td>";
                continue;
            }
            else {
                if ($i == 3) {
                    echo "<td>"
                    for ($b=0; $b < 10; $b++) { 
                        echo $arrayIkasle[$i][$a];
                        echo "</td>";
                    }
                    continue;
                }
                else {}
            }
        }

        ?>
    </table>
    
</body>
</html>