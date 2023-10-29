<?php
$servername = "localhost";
$username = "root";
$password = "";
$database = "cifpsanjorge";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

//Check connection
 if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully <br>";

// $sql = "INSERT INTO ikasleak (izena, abizena) VALUES ('Mikel','Urlezaga')";
// //multi_query
// if ($conn->query($sql)==TRUE) {
//     echo "Sartuta";
// }else{
//     echo "Bad";
// }


//Prepared
// $sql = "INSERT INTO ikasleak (izena, abizena) VALUES (?,?)";
// $stmt = $conn->prepare($sql);
// $stmt ->bind_param("ss",$izena,$abizena);
// //balioak
// $izena = "Mikel";
// $abizena = "Txurro";
// //Ejekutatu
// $stmt->execute();


// $sql = "SELECT * FROM ikasleak";
// $emaitza=$conn->query($sql);

// if($emaitza->num_rows>0){
//     while ($lerroa = $emaitza->fetch_assoc()){
//         echo $lerroa["izena"]. " " . $lerroa["abizena"];
//         echo "<br>";
//     }
// }

// $sql = "UPDATE ikasleak SET abizena='DonTxurro' WHERE abizena='Txurro'";

// if ($conn->query($sql) === TRUE) {
//     echo "Record updated successfully";
//   } else {
//     echo "Error updating record: " . $conn->error;
// }
  


// $sql = "DELETE FROM ikasleak WHERE abizena= ?";

// $stmt = $conn->prepare($sql);
// $abizena = "Txurro";
//     $stmt->bind_param("s",$abizena);

//     if ($stmt->execute()) {
//         echo "Registro(s) eliminado(s) con éxito.";
//     } else {
//         echo "Error al eliminar el registro: " . $stmt->error;
// }



// Close connection
$stmt->close();
$conn->close();
?>
