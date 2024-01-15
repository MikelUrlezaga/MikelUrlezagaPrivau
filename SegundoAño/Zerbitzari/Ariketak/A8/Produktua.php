<!DOCTYPE html>
<html>
<body>
<?php
class Produktua {
  public $izenburua;
  public $prezioa;

  function __construct($izenburua , $prezioa) {
	$this->izenburua = $izenburua;
    $this->prezioa = $prezioa;
  }
  function aukeratu() {
        $minimo = 0;
        $maximo = 2;
        $numero_aleatorio = mt_rand($minimo, $maximo);

        $izenburuAle = $this->izenburua[$numero_aleatorio];
        $prezioAle = $this->prezioa[$numero_aleatorio];
        $this->pantailaratu($izenburuAle,$prezioAle);

    }

    function pantailaratu($izenburuAle,$prezioAle) {
        echo "Produktua : " . $izenburuAle . "/ Prezioa : " . $prezioAle;
    }
}

$izenburuak = array("Peter","Pan","Txorizo");
$prezioak = array(50,75,60);
$produktua = new Produktua($izenburuak,$prezioak);
$produktua->aukeratu();
?>
</body>
</html>