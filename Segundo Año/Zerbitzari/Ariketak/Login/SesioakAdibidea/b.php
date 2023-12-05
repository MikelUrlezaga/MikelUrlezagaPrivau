<?php
session_start();
?>
<!DOCTYPE html>
<html>
<body>

<?php
// aldez aurretik definitutako aldagaiak 
echo "Kolorerik gogokoena " . $_SESSION["favcolor"] . ".<br>";
echo "Animaliariak gogokoena " . $_SESSION["favanimal"] . ".";
session_unset();
?>
</body>
</html>