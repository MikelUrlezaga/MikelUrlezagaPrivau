<?php
    /*Formularioa eta Objektuak: Sortu formulario bat Pertsona baten izena eta abizena jasotzeko. 
    Pertsona klasea, klase abstraktua izango da eta aurkeztu () metodo abstraktua izango du izena 
    eta abizena pantailatik ateratzeko. 

    PertsFormulario klaseak heredatuko du Pertsonatik eta aurkeztu() metodoa programatuko du.
    Guztia formularioa eta php kodea fitxategi berean egon behar da PHP_SELF deia egitea beharrezkoa 
    izango da. */

    abstract class Pertsona {
        protected $izena;
        protected $abizena;

        public function __construct($izena, $abizena) {
            $this->izena = $izena;
            $this->abizena = $abizena;
        }

        abstract public function aurkeztu();
    }
    
    class PertsFormulario extends Pertsona {
        public function aurkeztu(){
            echo "Zure izena: $this->izena eta Abizena: $this->abizena";
        }
    }

    $perts1 = null;
    
    // Formularioa prozesatu
    if(isset($perts1)){
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $izena = $_POST["izena"];
            $abizena = $_POST["abizena"];
            $perts1 = new PertsFormulario($izena, $abizena);
        }
    }   
?>


<!DOCTYPE html>
<html>
<head>
    <title>Ariketa 9</title>
</head>
<body>
    <h1>Pertsonak</h1>
    <p>Izen-abizenak dira:     
    <?php
        if(isset($perts1)){
            $perts1->aurkeztu();
        }
    ?>
    </p>

    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <label for="izena">Izena:</label>
        <input type="text" name="izena" id="izena" required>
        <label for="abizena">Abizena:</label>
        <input type="text" name="abizena" id="abizena" required>
        <input type="submit" value="Enviar">
    </form>


</body>
</html>




            
