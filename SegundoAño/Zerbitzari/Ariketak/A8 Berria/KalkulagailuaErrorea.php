<!DOCTYPE html>
<html>
<body>
<?php
class Kalkulagailua {
  public $eragiketa1;
  public $eragiketa2;
  public $eragiketa;
  public $total;

  function __construct($eragiketa1 , $eragiketa2, $eragiketa, $total) {
	$this->eragiketa1 = $eragiketa1;
    $this->eragiketa2 = $eragiketa2;
    $this->eragiketa = $eragiketa;
    $this->total = $total;
  }

  function setEragiketa1($eragiketa1) {
    $this->eragiketa1 = $eragiketa1;
  }

  function setEragiketa2($eragiketa2){
    $this->eragiketa2 = $eragiketa2;
  }

  function setEragiketa($eragiketa){
    $this->eragiketa = $eragiketa;
  }

  function getEragiketa1(){
    return $this->eragiketa1;
  }

  function getEragiketa2(){
    return $this->eragiketa2;
  }

  function getEragiketa(){
    return $this->eragiketa;
  }

  function getTotal(){
    return $this->total;
  }

  function eragiketaEgin(){
    switch ($eragiketa) {
        case +:
            $this->total = $this->eragiketa1 + $this->eragiketa2;
            break;
        case -:
            $this->total = $this->eragiketa1 - $this->eragiketa2;
            break;
        case *:
            $this->total = $this->eragiketa1 * $this->eragiketa2;
            break;
        case /:
            $this->total = $this->eragiketa1 / $this->eragiketa2;
            break;
        default;
        }
    
        echo $kalkulagailua->getEragiketa1() . " " . $kalkulagailua->getEragiketa() . " " . $kalkulagailua->getEragiketa2() . " = " . $kalkulagailua->getTotal();

    }
}


$kalkulagailua = new Kalkulagailua($_POST["Z1"],$_POST["Z2"],$_POST["Eragiketa"],"");

$kalkulagailua->eragiketaEgin();

?>

</body>
</html>