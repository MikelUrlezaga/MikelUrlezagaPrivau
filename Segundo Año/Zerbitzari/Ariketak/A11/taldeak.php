<?php
    include "db.php";

    $db = new DB ("localhost","root","","cifpsanjorge");


    if ($_SERVER["REQUEST_METHOD"]=="GET"){
        if (isset($_GET["ezabatu"])){
            //echo "prueba";
            ezabatuTalde($_GET["ezabatu"]);
        }
        if (isset($_GET["aldatu"])){
            //echo "entra";
            eguneratuTalde($_GET["aldatu"],$_GET["puntuak"]);
        }
        if (isset($_GET["izena"])&& isset($_GET["puntuak"])){
            //echo "txertatu";
            txertatuTaldea($_GET["izena"],$_GET["puntuak"]);
        }
    }

    function ezabatuTalde($id){
        global $db;
        $db->ezabatuTaldea($id);

    }

    function lortuTaldeak (){
        global $db;
        $emaitzak=$db->lortuTaldeak();
        return $emaitzak;
    }

    function eguneratuTalde ($id, $puntuak){
        global $db;
        //echo $id." ".$puntuak;
        $db->eguneratuTaldea($id, $puntuak);

    }

    function txertatuTaldea($izena, $puntuak){
        global $db;
        //echo "txertatu";
        $db->txertatuTalde($izena,$puntuak);
    }
?>
<html>
    <head>

    </head>
    <body>
        <table border=1>
            <tr>
                <th>ID</th><th>Izena</th><th colspan=3>Puntuak</th>
            </tr>
            <?php
                $emaitzak= lortuTaldeak();
                //var_dump($emaitzak);
                if (is_int($emaitzak)==FALSE){
                    foreach ($emaitzak as $lerroa){
            ?>
                <tr>
                    <form action=<?php echo $_SERVER["PHP_SELF"]?> method="GET">
                    <td><?php echo $lerroa["idTalde"];?></td>
                    <td><?php echo $lerroa["izena"];?></td>
                    <td><input type=text name=puntuak value=<?php echo $lerroa["puntuak"];?>></td>
                    <td><button type="submit" name="aldatu" value=<?php echo $lerroa["idTalde"];?>>Aldatu</button></td>
                    <td><button type="submit" name="ezabatu" value=<?php echo $lerroa["idTalde"];?>>Ezabatu</button></td>
                    </form>
                </tr>
            <?php    
                    }
                }
            ?>
        </table>
        <br>
        <div>

            <form action=<?php echo $_SERVER["PHP_SELF"]?> method="GET">
                    <label>Izena: </label><input type=text name=izena>
                    <label>Puntuak: </label><input type=text name=puntuak>
                    <input type=submit value=Bidali>
                
            </form>
        </div>
    </body>
</html>