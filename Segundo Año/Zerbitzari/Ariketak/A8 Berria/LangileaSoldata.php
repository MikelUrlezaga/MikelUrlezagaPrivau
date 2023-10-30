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
  function soldataIgo($igoera) {
    $this->soldata = $this->soldata + $igoera;
    echo "Soldata berria hau da = " . $this->soldata;
  }
}

$langilea = new Langile("Mikel",100);
$langilea->soldataIgo(50);

?>
</body>
</html>