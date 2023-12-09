<?php
if(isset($_COOKIE["b"])){
     header("Location: crearUsuario.php");
     exit();
}
setcookie("a","a",time()+120);
?>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <form action=<?php echo $_SERVER["PHP_SELF"];?> method="get">
            <fieldset>
                <label for="erabiltzailea">Erabiltzailea</label>
                <input type="text" id="erabiltzailea" name="erabiltzailea"><br><br>
                <label for="pasahitza">Pasahitza</label>
                <input type="pasahitza" id="pasahitza" name="pasahitza"><br><br>
                <input type="submit" value="Submit" name="enviar">
            </fieldset>  
        </form>
    </body>
</html>
<?php
if (isset($_GET["erabiltzailea"])) {
    $servername ="localhost";
    $user ="root";
    $pass ="";
    $dbname ="login";
    $conn = new mysqli($servername,$user,$pass,$dbname);
    $usuario = $_GET["erabiltzailea"];
    $pasahitza = $_GET["pasahitza"];
    $sql="SELECT * FROM usuarios WHERE Usuario = '$usuario'";
    $result = $conn->query($sql);
    foreach ($result as $pertsona){
        foreach ($pertsona as $izena){
            if (password_verify($pasahitza, $pertsona["Pass"])) {
                header("Location: crearUsuario.php");
            }
        }    
    }
    $conn->close();
}
?>