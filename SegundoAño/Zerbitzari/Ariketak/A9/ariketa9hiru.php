<?php
    /*Formularioa eta Interfazeak: Sortu interfaze bat Animalia izenekoa eta Txakurra 
    eta Katua klaseek interfaze hori inplementatuko dute. Animalia klaseak esan() metodoa 
    izango du soilik eta animaliaren arabera, honek egiten duen soinua pantailatik aterako 
    du (Txakurrak “GUAU”, Katuak “MIAU”). Formulario bat animali bat aukeratzeko eta 
    informazioa bistaratzeko erabiliko dugu (input erabili beharrean “select” etiketa 
    erabiliko duzue). */

    interface Animalia {
        public function esan();
    }
      
    class Katua implements Animalia {
        public function esan() {
            echo "Miau";
        }
    }
    
    class Txakurra implements Animalia {
        public function esan() {
            echo "Guau";
        }
    }
    
    $animal = new Katua();

    // Formularioa prozesatu
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $aukera = $_POST["aukera"] ?? null;
        if ($aukera == "katua") {
            $animal = new Katua();
        } else {
            $animal = new Txakurra();
        }
    }
?>
    
<!DOCTYPE html>
<html>
    <head>
        <title>Ariketa 9</title>
    </head>
<body>
    <h1>Animaliak</h1>
    <p>Soinua: <?php echo $animal->esan(); ?></p>

    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <label for="aukera">Aukeratu:</label>
        <select name="aukera" id="aukera">
            <option value="katua">Katua</option>
            <option value="txakurra">Txakurra</option>
        </select>
        <input type="submit" value="Bidali">
    </form>
</body>
</html>




            
