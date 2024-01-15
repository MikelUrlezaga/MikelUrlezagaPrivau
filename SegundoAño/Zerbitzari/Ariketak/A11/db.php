<?php
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
            }
        }

        public function txertatuTalde ($izena, $puntuak){
            $this->konektatu();
            $sql="INSERT INTO taldea (izena,puntuak) VALUES (?,?)";
            $stmt=$this->conn->prepare ($sql);
            //echo $izena." ".$puntuak;
            $stmt->bind_param ("ss",$izena,$puntuak);
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
            //return "konexioa eginda";
        }

        public function lortuTaldeak (){
            $this->konektatu();
            $sql ="SELECT * FROM taldea";
            $emaitza=$this->conn->query($sql);
            if ($emaitza->num_rows>0){              
                return $emaitza;
            }else{
                return 0;
            }
            $this->conn->close();
        }

        public function ezabatuTaldea ($id){
            $this->konektatu();
            $stmt = $this->conn->prepare ("DELETE FROM taldea WHERE idTalde=?");
            $stmt->bind_param("i",$id);
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
        }

        public function eguneratuTaldea ($id, $puntuak){
            $this->konektatu();
            echo $id." ".$puntuak;
            $stmt = $this->conn->prepare ("UPDATE taldea SET puntuak=? WHERE idTalde=?");
            $stmt->bind_param("ii",$puntuak, $id);
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
        }
    }
?>