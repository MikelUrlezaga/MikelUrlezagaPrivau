<!DOCTYPE html>
<html>
    <body>
        <h1>Zein egun da?</h1>
        <?php
        // Lehenengo aldagaia sortu eta date() funtzioa erabilita "N" jarrita asteko eguna bueltatzen, esleituko dugu
        // Gero balore hay jakinda String-a dela, int-era pasatuko dugu intval() funtzioa erabilita
            $data = date("N");
            $data = intval($data);
            
            //$data balore bakoitzerako, asteko egun bat echo egitea da, horretarako if/esleif erabiliko da

            if ($data == 1) {
                echo "Astelehena";
            }
            elseif ($data == 2) {
                echo "Asteartea";
            }
            elseif($data == 3){
                echo "Asteartea";
            }
            elseif($data == 4){
                echo "Osteguna";
            }
            elseif($data ==  5){
                echo "Ostirala";
            }
            elseif($data == 6){
                echo "Larunbata";
            }
            else($data == 7){
                echo "Domeka";
            }
        ?>
    </body>
</html>