<!DOCTYPE html>
<html>
    <head>
        <title>Ariketa 9</title>
    </head>
    <body>
        <?php
            /*Klase Abstraktua eta Array-ak: Sortu Figura klasea abstraktua kalkulatu 
            azalera metodo abstraktua izango duena, eta Lauki eta Zirkulua klaseek klase hori 
            heredatuko dute (bakoitzak azalara kalkulatzeko propietateak izan beharko dituzte). 
            Array batean lauki bat eta zirkulu bat gorde eta bakoitzaren azalerak bistaratu.*/

            //perimetro = 2 x pi x r
            //area = pi x r^2

            //area = 1 / 4 * pi * diámetro al cuadrado

            //lado x lado

            abstract class Figura {
                abstract public function azaleraKalkulatu();
            }
            
            class Lauki extends Figura {
                private $aldea1;
                private $aldea2;

                public function __construct($aldea1, $aldea2) {
                    $this->aldea1 = $aldea1;
                    $this->aldea2 = $aldea2;
                }
            
                public function azaleraKalkulatu() {
                    return $this->aldea1 * $this->aldea2;
                }
            }

            class Zirkulua extends Figura {
                private $erradioa;

                public function __construct($erradioa) {
                    $this->erradioa = $erradioa;
                }
            
                public function azaleraKalkulatu() {
                    return pi() * pow($this->erradioa, 2);
                }
            }

            $figurak = [new Lauki(3, 3), new Zirkulua(6)];

            foreach ($figurak as $figura) {
                echo "Azalera: " . $figura->azaleraKalkulatu() . "<br>";
            }
        ?>
    </body>
</html>




            
