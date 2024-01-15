<?php
    include "..\db.php";

   class Pertsona{
        public $id;
        public $izena;
        public $abizenak;
        public $adina;
        public $soldata;

        public function __construct ($id, $izena, $abizenak, $adina, $soldata){
            $this->id=$id;
            $this->izena=$izena;
            $this->abizenak=$abizenak;
            if (is_int($adina))
                $this->adina=$adina;
            if (is_float($soldata))
                $this->soldata=0.0;
        }
    }

    if ($_SERVER["REQUEST_METHOD"]=="GET"){
        if (isset($_GET["abizena"])){
            $pertsonak = array();
            $db = new DB ("localhost","root","", "e1azterketa");
            $erantzuna=$db->selectAll();
            while ($lerroa = $erantzuna->fetch_assoc() ){
                if (strcmp(substr($lerroa["abizenak"],0,strlen($_GET["abizena"])),$_GET["abizena"])){
                    $pertsonak[]=new Pertsona($lerroa["id"], $lerroa["izena"], $lerroa["abizenak"], $lerroa["adina"], $lerroa["soldata"]);
                }

            }
            echo json_encode($pertsonak);
        }
    }
    
?>