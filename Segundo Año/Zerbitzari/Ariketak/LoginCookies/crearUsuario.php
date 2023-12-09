<?php
if(!isset($_COOKIE["a"])){
    header("Location: login.php");
    exit();
}
setcookie("b","b",time()+120);
?>
<!DOCTYPE html>
<html>
    <head>
    
    </head>
    <body>
        <div style="border: 2px solid #000; margin-right:75%;">
            <div style="margin: 10px;">
            <img src="IFC.png" style="height: 200px;">
            <h1>Erabiltzailea</h1>
            <form action=<?php echo $_SERVER["PHP_SELF"];?> method="get">
                    <fieldset>
                        <legend>Erabiltzailea:</legend>
                        <label for="UserName">Erabiltzaile</label>
                        <input type="text" id="UserName" name="Usuario"><br><br>
                        <label for="Password">Pasahitza</label>
                        <input type="password" id="Password" name="Password"><br><br>
                        <input type="submit" value="Submit" name="enviar">
                    </fieldset>  
            </form>
            </div>
        </div>
    </body>
</html>
<?php
if (isset($_GET["Usuario"])) {
    // echo $_GET["Usuario"];
    // echo "<br>";
    // echo $_GET["Password"];
    $usuario = $_GET["Usuario"];
    $pass = $_GET["Password"];

    $hashPass = password_hash($pass, PASSWORD_BCRYPT);
    // echo $hashPass;
    meterUsuario($usuario,$hashPass);
}
function meterUsuario($usuario,$hashPass){
    $servername ="localhost";
    $user ="root";
    $pass ="";
    $dbname ="login";
    $conn = new mysqli($servername,$user,$pass,$dbname);
    $sql = "INSERT INTO usuarios (Usuario,Pass) VALUES ('".$usuario."','".$hashPass."')";
    $conn->query ($sql);
}
?>