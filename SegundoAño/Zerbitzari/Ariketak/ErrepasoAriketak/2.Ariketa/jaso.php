<?php
    class Pertsona{
        private $izena;
        private $abizena;

        public function __construct($izena, $abizena){
            $this->izena = $izena;
            $this->abizena = $abizena;
        }

        function getIzena(){
            return $this->izena;
        }

        function getAbizena(){
            return $this->abizena;
        }

        public function erakutsi(){
            echo "Izena hau da:  {$this->izena}  eta abizena beste hau: " . $this->getAbizena(); 
        }
        
    }

    $pertsona = new Pertsona($_POST["izena"],$_POST["abizena"]);
    // $pertsona = new Pertsona("mikel","urlezaga");
    $pertsona->erakutsi();
?>