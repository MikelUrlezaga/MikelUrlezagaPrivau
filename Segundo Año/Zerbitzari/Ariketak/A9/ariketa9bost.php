<?php
    /*Herentzia eta Formularioak: Sortu Animalia klasea eta klaseak Txakurra eta Katua 
    heredatzen ditu. Formulario batean animali mota bat aukeratzeko eta informazioa 
    bistaratzeko erabiliko dugu.  */

    Class Animalia {
        private $izena;
        private $kolorea;
        private $elikadura;
        
        public function __construct($izena, $kolorea, $elikadura) {
            $this->izena = $izena;
            $this->kolorea = $kolorea;
            $this->elikadura = $elikadura;
        }

        public function informazioaBueltatu() {
            return $this->izena . " naiz, " . $this->kolorea . " kolorea dut, eta " . $this->elikadura . " jaten dut.";
        }
    }
      
    class Katua extends Animalia {
        private $miauBolumena;
        private $azkazalenLuzeera;
        
        public function __construct($izena, $kolorea, $elikadura, $miauBolumena, $azkazalenLuzeera) {
            parent::__construct($izena, $kolorea, $elikadura);
            $this->miauBolumena = $miauBolumena;
            $this->azkazalenLuzeera = $azkazalenLuzeera;
        }

        public function informazioaBueltatu() {
            return parent::informazioaBueltatu() . " Nire ahots bolumena da " . $this->miauBolumena . ", eta nire azkazalak " . $this->azkazalenLuzeera . " luzeera dute.";
        }
    }
    
    class Txakurra extends Animalia {
        private $guauBolumena;
        private $arraza;
    
        public function __construct($izena, $kolorea, $elikadura, $guauBolumena, $arraza) {
            parent::__construct($izena, $kolorea, $elikadura);
            $this->guauBolumena = $guauBolumena;
            $this->arraza = $arraza;
        }
    
        public function informazioaBueltatu() {
            return parent::informazioaBueltatu() . " Nire ahots bolumena da " . $this->guauBolumena . ", eta nire arraza da " . $this->arraza;
        }
    }
    
    $animal = new Katua("", "", "", "", "");

    // Formularioa prozesatu
    if(isset($_POST['aukera'])){
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $aukera = $_POST["aukera"] ?? null;
            $izena = $_POST["izena"] ?? "";
            $kolorea = $_POST["kolorea"] ?? "";
            $elikadura = $_POST["elikadura"] ?? "";
    
            if ($aukera == "katua") {
                $miauBolumena = $_POST["miauBolumena"] ?? "";
                $azkazalenLuzeera = $_POST["azkazalenLuzeera"] ?? "";
                $animal = new Katua($izena, $kolorea, $elikadura, $miauBolumena, $azkazalenLuzeera);
            } else {
                $guauBolumena = $_POST["guauBolumena"] ?? "";
                $arraza = $_POST["arraza"] ?? "";
                $animal = new Txakurra($izena, $kolorea, $elikadura, $guauBolumena, $arraza);
            }
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
    <p><?php echo $animal->informazioaBueltatu(); ?></p>

    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <label for="aukera">Aukeratu:</label>
        <select name="aukera" id="aukera">
            <option value="katua">Katua</option>
            <option value="txakurra">Txakurra</option>
        </select>

        

        <?php
             if(isset($_POST['aukera'])){
        ?>
            <html>
                <label for="izena">Izena:</label>
                <input type="text" name="izena" id="izena" step="0.01" required>
                <label for="kolorea">Kolorea:</label>
                <input type="text" name="kolorea" id="kolorea" step="0.01" required>
                <label for="elikadura">Elikadura:</label>
                <input type="text" name="elikadura" id="elikadura" step="0.01" required>
            </html>
        <?php
            if($_POST['aukera'] == "katua"){
        ?>
            <html>
                <label for="miauBolumena">Miau Bolumena:</label>
                <input type="number" name="miauBolumena" id="miauBolumena" step="0.01" required>
                <label for="azkazalenLuzeera">Azkazalen Luzeera:</label>
                <input type="number" name="azkazalenLuzeera" id="azkazalenLuzeera" step="0.01" required>
            </html>
        <?php
            }else{  
        ?>
            <html>
                <label for="guauBolumena">Guau Bolumena:</label>
                <input type="number" name="guauBolumena" id="guauBolumena" step="0.01" required>
                <label for="arraza">Arraza:</label>
                <input type="text" name="arraza" id="arraza" step="0.01" required>
            </html>
        <?php
            } 
            }
        ?>

        <input type="submit" value="Bidali">
    </form>
</body>
</html>




            
