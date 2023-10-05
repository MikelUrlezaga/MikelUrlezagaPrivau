<!DOCTYPE html>
<html>
    <body>
        <?php
            if (!empty($_POST["email"])) {
                echo "<p>Emaila Ondo<p>";
            }else{
                echo "<p>Emaila Txarto</p>";
            }

            $nan = $_POST["nan"];

            if (!empty($nan)) {
                echo "<p>NAN Ondo<p>";
            }else{
                echo "<p>NAN Txarto</p>";
            }

            if (!empty($_POST["data"])) {
                $data = $_POST["data"];
                echo "<p>$data</p>";
            }
        ?>
</body>
