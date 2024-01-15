<!DOCTYPE html>
<html>
<body>
<?php
class Autoa {
  public $marka;
  public $modeloa;

  function __construct($marka , $modeloa) {
	$this->marka = $marka;
    $this->modeloa = $modeloa;
  }
  function aurkeztu() {
    echo "Autoaren marka hau da: " . $this->marka . " <br>Eta modeloa hau da: " . $this->modeloa;
  }
}

$autoa = new Autoa("Audi","A3");
$autoa->aurkeztu();
?>
</body>
</html>
