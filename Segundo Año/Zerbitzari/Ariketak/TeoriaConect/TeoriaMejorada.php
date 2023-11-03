<?php
    class TeoriaMejorada {
        private $servername="";
        private $username="";
        private $password="";
        private $database="";
        private $conn="";
    
        public function __construct ($servername,$username,$password,$database){
            $this->servername=$servername;
            $this->username=$username;
            $this->password=$password;
            $this->database=$database;
        }


        private function konektatu (){
            $this->conn = new mysqli($this->servername,$this->username,$this->password,$this->database);
            if ($this->conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
              }
            echo "Connected successfully <br>";
        }


        public function insertStatement(){
            $this->konektatu();
            $sql = "INSERT INTO ikasleak (izena, abizena) VALUES (?,?)";
            $stmt = $this->conn->prepare($sql);
            $stmt ->bind_param("ss",$izena,$abizena);
            //balioak
            $izena = "Mikel";
            $abizena = "Txurro";
            //Ejekutatu
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
        }


        public function insert(){
            $this->konektatu();
            $sql = "INSERT INTO ikasleak (izena, abizena) VALUES ('Mikel','Urlezaga')";
            //multi_query
            if ($this->conn->query($sql)==TRUE) {
                echo "Sartuta";
            }else{
                echo "Bad";
            }
            $this->conn->close();
        }


        public function select(){
            $this->konektatu();
            $sql = "SELECT * FROM ikasleak";
            $emaitza=$this->conn->query($sql);

            if($emaitza->num_rows>0){
                while ($lerroa = $emaitza->fetch_assoc()){
                    echo $lerroa["izena"]. " " . $lerroa["abizena"];
                    echo "<br>";
                }
            }
            $this->conn->close();
        }


        public function update(){
            $this->konektatu();
            $sql = "UPDATE ikasleak SET abizena='DonTxurro' WHERE abizena='Txurro'";

            if ($this->conn->query($sql) === TRUE) {
                echo "Record updated successfully";
            } else {
                echo "Error updating record: " . $this->conn->error;
            }
            $this->conn->close();
        }


        public function delete(){
            $this->konektatu();
            $sql = "DELETE FROM ikasleak WHERE abizena= ?";

            $stmt = $this->conn->prepare($sql);
            $abizena = "DonTxurro";
                $stmt->bind_param("s",$abizena);
            
                if ($stmt->execute()) {
                    echo "Registro(s) eliminado(s) con éxito.";
                } else {
                    echo "Error al eliminar el registro: " . $stmt->error;
            }
            $stmt->close();
            $this->conn->close();
        }
    }

    $teoriaMejorada = new TeoriaMejorada("localhost","root","","cifpsanjorge");
    $teoriaMejorada->insertStatement();
    $teoriaMejorada->insert();
    $teoriaMejorada->select();
    $teoriaMejorada->update();
    $teoriaMejorada->delete();
    
?>