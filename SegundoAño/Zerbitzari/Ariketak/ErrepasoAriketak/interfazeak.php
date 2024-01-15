<?php
    Interface God {
        public function izenaEsan();
    }

    class Jeje Implements God {
        private $izena;
        private $apodo;

        public function __construct($izena,$apodo){
            $this->izena = $izena;
            $this->apodo = $apodo;
        }

        public function izenaEsan(){
            echo "Señoras y Señores, con ustedes ..... ".$this->izena." con el apodo de: ".$this->apodo;
        }
    }

    $jeje = new JEJE ("Knekro","KENKRO");
    $jeje->izenaEsan();
?>