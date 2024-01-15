<?php
    include "..\db.php";
    if ($_SERVER["REQUEST_METHOD"]=="GET"){
        if (isset($_GET["adinMin"])&isset($_GET["adinMax"])){
            echo "<div style='border: 2px solid black'>";
            $sql="SELECT * FROM a1 WHERE adina>".$_GET["adinMin"]." AND adina<".$_GET["adinMax"];
            $db = new DB ("localhost", "root", "", "e1azterketa");
            $result = $db->select($sql);
            foreach ($result as $pertsona){
                foreach ($pertsona as $izena=>$datua){
                    echo $izena.": ".$datua." ";
                }    
                echo "<br>";
            }
            echo "</div>";
        }
    }
?>

<html>
    <body>
        <form action=<?php echo $_SERVER["PHP_SELF"];?> method="get">
            <Label> Adin min: </label> <input type="text" name="adinMin"><br>
            <Label> Adin max: </label> <input type="text" name="adinMax"><br>
            <input type="submit">
        </form>
    </body>
</html>