<!DOCTYPE html>
<html>
<body>
<?php
class Langile {
  public $izena;
  public $soldata;

  function __construct($izena , $soldata) {
	$this->izena = $izena;
    $this->soldata = $soldata;
  }
  function batazbestekoNota() {
    $suma = 0;
    $zenbat = 0;
    foreach ($this->notak as $value) {
        $suma = $suma + $value;
        echo $suma;
        echo "<br>";
        $zenbat++;
    }
}

$langilea = new Langilea("Mikel",100);

$ikaslea->batazbestekoNota();
echo "<br>";
$ikaslea->irakurriNota();
?>
</body>
</html>
