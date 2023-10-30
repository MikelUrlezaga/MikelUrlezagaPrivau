<!DOCTYPE html>
<html>
    <body>
        <?php
            class Autoa {
                public $marka;
                public $modeloa;

                function __construct($marka, $modeloa){
                    $this->marka = $marka;
                    $this->modeloa = $modeloa;
                }

                public function aurkeztu(){
                    echo "Auto marka ".$this -> marka." da";
                    echo "<br>";
                    echo "Auto moldeloa {$this -> modeloa} da";
                }
            }

            $autoa = new Autoa("Audi","A3");
            $autoa->aurkeztu();
        ?>
    </body>
</html>