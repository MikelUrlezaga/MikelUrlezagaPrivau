<?php
    setcookie("tamo","tamo",time()+5);

if(isset($_COOKIE["tamo"])){
    echo "Kaixo";
} else {
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
            <form action="usuario.php" method="get">
                    <fieldset>
                        <legend>Erabiltzailea:</legend>
                        <label for="UserName">Erabiltzaile</label>
                        <input type="text" id="UserName" name="Usuario"><br><br>
                        <label for="Password">Pashitza</label>
                        <input type="password" id="Password" name="Password"><br><br>
                        <input type="submit" value="Submit" name="enviar">
                    </fieldset>  
            </form>
            </div>
        </div>
    </body>
</html>
<?php
}
?>