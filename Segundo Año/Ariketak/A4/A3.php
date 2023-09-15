<!DOCTYPE html>
<html>
    <body>
        <h1>3Ariketa</h1>
            <table bgcolor="red">

                <?php

                $gehiketa = 0;
                $arrayRandom = array(rand(0,10),rand(0,10),rand(0,10),rand(0,10),rand(0,10));
                for ($i=0; $i < count($arrayRandom); $i++){ ?>
                    
                    <tr bgcolor='cian'>
                    <td><?php
                    if ($arrayRandom[$i]%2 == 0) {
                        echo $arrayRandom[$i] . " Bikoitia";
                    }
                    else {
                        echo $arrayRandom[$i] . " Bakoitia";
                    }

                    ?>
                    </td>
                    </tr>  
                    <?php

                }?>
                
            </table>
    </body>
</html>