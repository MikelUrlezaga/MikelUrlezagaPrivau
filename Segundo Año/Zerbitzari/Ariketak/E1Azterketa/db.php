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

        public function insert ($sql){
            //kitarlo para el examen
            $this->konektatu();
            if (!$this->conn->query ($sql)){
                echo "ezin izan da datua txertatu";
            }
            $this->conn->close();
        }

        public function select ($sql){
            //kitarlo para el examen
            $this->konektatu();
            try {
                $result = $this->conn->query($sql);
                if ($result->num_rows>0){
                    return $result;
                }
            } catch (Exception $e){
                return "errorea kontsulta egiterakoan";
            }
            $this->conn->close();
        }

        public function selectAll(){
            //kitarlo para el examen
            $this->konektatu();
            try {
                $result = $this->conn->query("SELECT * FROM a1");
                if ($result->num_rows>0){
                    return $result;
                }
            } catch (Exception $e){
                return "errorea kontsulta egiterakoan";
            }
            $this->conn->close(); 
        }

        public function delete ($sql){
            //kitarlo
            $this->konektatu();
            $this->conn->query($sql);
            echo "leroak ".$this->conn->affected_rows;
            if ($this->conn->affected_rows>0){
                echo "lerro bat ezabatuta";
            }else{
                echo "Ez da existitzen id hori";
            }
            $this->conn->close();
        }
    } 
?>