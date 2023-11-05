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


        public function insertStatement($izena,$abizena){
            $this->konektatu();
            $sql = "INSERT INTO ikasleak (izena, abizena) VALUES (?,?)";
            $stmt = $this->conn->prepare($sql);
            $stmt ->bind_param("ss",$izena,$abizena);
            //Ejekutatu
            $stmt->execute();
            $stmt->close();
            $this->conn->close();
        }

        public function select(){
            $this->konektatu();
            $id = $_POST["izena"];
            $sql = "SELECT * FROM ikasi WHERE idikasle = $id";
            $emaitza=$this->conn->query($sql);

            if($emaitza->num_rows>0){
                while ($lerroa = $emaitza->fetch_assoc()){
                    echo $lerroa["idikasle"]. " " . $lerroa["idikasgai"]. " " . $lerroa["nota"];
                    echo "<br>";
                }
            }
            $this->conn->close();
        }

        public function ateraInfo(){
            $array=json_decode(file_get_contents(__DIR__.'/JSON.json'),true);
            var_dump($array);
            $this->insertStatement($array["izena"],$array["abizena"]);
        }

    }

    $teoriaMejorada = new TeoriaMejorada("localhost","root","","cifpsanjorge");
    $teoriaMejorada->select();
    $teoriaMejorada->ateraInfo();
?>