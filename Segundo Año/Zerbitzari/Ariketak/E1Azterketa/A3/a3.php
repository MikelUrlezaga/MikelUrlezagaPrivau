<?php 
    include "interface.php";
    include "..\db.php";

    class Pertsona implements DatuakKudeatu{
        public $id;
        public $izena;
        public $abizenak;
        public $adina;
        public $soldata;

        public function __construct (){
            $this->id="";
            $this->izena="";
            $this->abizenak="";
            $this->adina=0;
            $this->soldata=0.0;
        }


        public function setPertsona ($id){
            $sql = "SELECT * FROM a1 WHERE id=".$id;
            $db = new DB ("192.168.202.104", "azterketa", "123", "E1Imanol");
            $erantzuna = $db->select($sql);
            if ($erantzuna!=null){
                foreach ($erantzuna as $datuak){
                    $this->id=$datuak["id"];
                    $this->izena=$datuak["izena"];
                    $this->abizenak=$datuak["abizenak"];
                    $this->adina=$datuak["adina"];
                    $this->soldata=$datuak["soldata"];
                }
            }
        }
    }

    $pertsona = new Pertsona ();
    $pertsona->setPertsona(12);
    echo "ID: ".$pertsona->id." Izena: ".$pertsona->izena." Abizenak: ".$pertsona->abizenak." Adina: ".$pertsona->adina." Soldata: ".$pertsona->soldata;
?>


