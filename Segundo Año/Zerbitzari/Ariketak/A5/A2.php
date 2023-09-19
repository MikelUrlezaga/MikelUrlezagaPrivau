<!DOCTYPE html>
<html>
    <body>
        <h1>2Ariketa</h1>
            <table bgcolor="red">
                <?php

                    $gehitura = 0;
                    $array = array(array("ikaslea" => "Jon", "nota" => 8) ,array("ikaslea" => "Ane", "nota" => 9), array("ikaslea" => "Markel", "nota" => 7));
                    $batas = 0;
                    foreach ($array as $value) {?>
                        <tr bgcolor="white">
                        <?php
                        $zenbakia = 0;
                        
                        foreach ($value as $key) {
                            $zenbakia++;
                            if ($zenbakia%2 == 0) {
                                $gehitura = $gehitura + $key; 
                                $batas = $batas + 1;
                            }
                            echo "<td>$key</td>";  
                        }
                        ?>
                        </tr>
                        <tr bgcolor='green'>
                        <td colspan="2"><?php
                        $batasbeste = $gehitura/$batas;
                        echo $batasbeste?></td>
                        </tr>
                    <?php
                    }
                ?>
            </table>
    </body>
</html>