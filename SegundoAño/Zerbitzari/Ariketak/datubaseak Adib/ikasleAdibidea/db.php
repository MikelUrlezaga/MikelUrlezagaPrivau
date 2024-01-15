<?php
    include "ikasgaia.php";
    class DB {
        private $servername;
        private $user;
        private $pass;
        private $dbname;
        private $conn;
        
        public function __construct ($servername, $user, $pass, $dbname){
            $this->servername=$servername;
            $this->user=$user;
            $this->pass=$pass;
            $this->dbname=$dbname;
        }

        private function konektatu (){
            $this->conn = new mysqli ($this->servername, $this->user, $this->pass, $this->dbname);
            if ($this->conn->connect_error){
                die("Konexioak huts egin du".$conn->connect_error);
            }else{
                echo "Konexioa eginda <br>";
            }
        }

        public function txertatuIkasgai ($izena, $deskribapena){
            $this->konektatu();
            $sql="INSERT INTO ikasgaiak (izena,deskribapena) VALUES (?,?)";
            $stmt=$this->conn->prepare ($sql);
            echo $izena." ".$deskribapena;
            $stmt->bind_param ("ss",$izena,$deskribapena);
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
            return "konexioa eginda";
        }

        public function lortuIkasgai (){
            $this->konektatu();
            $ikasgaiak= array();
            $sql ="SELECT * FROM ikasgaiak";
            $emaitza=$this->conn->query($sql);
            if ($emaitza->num_rows>0){
                while ($lerroa=$emaitza->fetch_assoc()){
                    $ikasgaiak[]=new ikasgaia($lerroa["izena"], $lerroa["deskribapena"]);
                }
                return $ikasgaiak;
            }else{
                return 0;
            }
            $this->conn->close();

        }
    } 
?>