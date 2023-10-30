<?php
    include ("db.php");
    $db=new DB ("localhost","root","","cifpsanjorge");
    //atera pantailatik get bidez helduko zaigun zenbaki bat eta itzuliko dugu kaixo mundua
    header("Content-Type: application/json; charset=UTF-8");
    if ($_SERVER["REQUEST_METHOD"]=="GET"){
        $emaitza=$db->lortuIkasgai();
        //var_dump($emaitza);
        //echo "<br>";
        //var_dump(json_encode($emaitza));
        echo json_encode($emaitza);        
    }

    

?>