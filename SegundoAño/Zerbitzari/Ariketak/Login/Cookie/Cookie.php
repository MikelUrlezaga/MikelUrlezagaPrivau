<?php
    setcookie("erabiltzailea","Sergio",time()+20);
?>
<!DOCTYPE html>
<html>
<body>

<?php
    if(isset($_COOKIE["erabiltzailea"])){
        echo $_COOKIE["erabiltzailea"];
    } else {
        echo "ez dago";
    }
?>
</body>
</html>