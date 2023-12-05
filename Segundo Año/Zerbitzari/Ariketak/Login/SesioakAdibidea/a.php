<?php
// Hasi saioa
session_start();
?>
<!DOCTYPE html>
<html>
<body>

<?php
// Definitu aldagaiak
$_SESSION["favcolor"]= "zurigorri";
$_SESSION["favanimal"] = "leoia";
echo "Sesio aldagaiak definituta";
?>
</body>
</html>