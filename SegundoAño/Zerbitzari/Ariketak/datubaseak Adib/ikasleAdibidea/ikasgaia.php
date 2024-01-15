<?php
    class ikasgaia {
        public $id;
        public $izena;
        public $deskribapena;
/*
        public function __construct ($id,$izena,$deskribapena){
            $this->id=$id;
            $this->izena=$izena;
            $this->deskribapena=$deskribapena;            
        }
*/

        public function __construct ($izena,$deskribapena){
            $this->izena=$izena;
            $this->deskribapena=$deskribapena;            
        }
    }
?>