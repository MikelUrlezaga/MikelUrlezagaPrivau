<?php
$servername = "localhost";
$username = "root";
$password = "";
$database = "cifpsanjorge";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully <br>";

$sql = "INSERT INTO ikasleak (izena, abizena) VALUES ('Mikel','Urlezaga')";
//multi_query
if ($conn->query($sql)==TRUE) {
    echo "Sartuta";
}else{
    echo "Bad";
}

/*
//Prepared
$sql = "INSERT INTO ikasleak (izena, abizena) VALUES (?,?)";
$stmt = $conn->prepare($sql);
$stmt ->bind_param("ss",$izena,$abizena);
//balioak
$izena = "Mikel";
$abizena = "Txurro";
//Ejekutatu
$stmt->execute();
*/

$sql = "SELECT * FROM ikasleak";
$emaitza=$conn->query($sql);

if($emaitza->num_rows>0){
    while ($lerroa = $emaitza->fetch_assoc()){
        echo $lerroa["izena"]. $lerroa["abizena"];
    }
}
// Close connection
//$stmt->close();
$conn->close();
?>
