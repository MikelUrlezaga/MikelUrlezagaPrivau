<?php
    /* 
    json --> {"numeros_enteros": [43, 17, 89, 55, 72, 30, 64, 12, 98, 41]
    }
    */
    include "..\db.php";
    header("Content-Type: application/json; charset=UTF-8");
    $obj = json_decode(file_get_contents('php://input'), true);

    $db = new DB ("localhost", "root", "", "e1azterketa");

    foreach ($obj["numeros_enteros"] as $zbk){
        $sql = "DELETE FROM a1 WHERE id=".$zbk;
        $db->delete($sql);
    }
?>