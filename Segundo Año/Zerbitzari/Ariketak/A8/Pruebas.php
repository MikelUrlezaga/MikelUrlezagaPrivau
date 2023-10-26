<!DOCTYPE html>
<html>
    <head>
        <title>Probak Egiteko</title>
    </head>
    <body>
        <?php
            class Ikasle {
                public $izena;
                public $notak;

                function __construct($izena, $notak){
                    $this->izena=$izena;
                    $this->notak=$notak;
                }
                function batasbestekoNota(){
                    $suma = 0;
                    $zenbat = 0;
                    foreach ($this->notak as $value) {
                        $suma = $suma + $value;
                        echo $suma;
                        echo "<br>";
                        $zenbat++;
                    }

                    $suma = $suma/$zenbat;
                    echo $suma;

                }

                function irakurriNota(){
                    $nota = 0;
                    foreach ($this->izena as $value) {
                        echo $value;
                        echo "<br>";
                        echo $this->notak[$nota];
                        echo "<br>";
                        $nota++;
                    }
                }
            }

            $ikasleak = array("Mikel","Julen","Asier");
            $notak = array(5,7,8);
            $ikaslea = new Ikasle($ikasleak, $notak);

            $ikaslea->batasbestekoNota();
            echo "<br>";
            $ikaslea->irakurriNota();
        ?>
    </body>
</html>
