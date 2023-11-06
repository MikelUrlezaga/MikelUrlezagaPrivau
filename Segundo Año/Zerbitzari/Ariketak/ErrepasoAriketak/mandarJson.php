<?php

// class Mandar  {
//     public $izena = "";
//     public $abizena = "";

//     public function __construct($izena, $abizena) {
//         $this->izena = $izena;
//         $this->abizena = $abizena;
//     }

// }
// header("Content-Type: application/json; charset=UTF-8");
// $mandar = new Mandar("Mikel", "Urlezaga");
// $mandarJ = json_encode($mandar);
// echo $mandarJ;

    $array=array("Kaixo","Mikel","Naiz");

    $bidali = json_encode($array);
    echo $bidali;
?>