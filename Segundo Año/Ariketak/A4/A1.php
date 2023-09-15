<!DOCTYPE html>
<html>
    <body>
        <h1>1Ariketa</h1>
            <table bgcolor="red">
                <tr bgcolor='cian'>
                <?php
                $gehiketa = 0;
                $arrayRandom = array(rand(0,10),rand(0,10),rand(0,10),rand(0,10),rand(0,10));
                for ($i=0; $i < count($arrayRandom); $i++){ ?>
                    
                    <td><?php echo $arrayRandom[$i]?></td>
                    
                    <?php
                    $gehiketa = $gehiketa + $arrayRandom[$i];
                }?>
                </tr>
                <tr bgcolor='blue'>
                    <td colspan="5"><?php echo $gehiketa ?></td>
                </tr>
            </table>
    </body>
</html>