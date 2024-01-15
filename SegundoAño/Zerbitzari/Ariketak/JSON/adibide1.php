<?php
    $age = array("Peter" =>35, "Ben" =>37, "Joe"=>43);
    $ageJson = json_encode($age);
    var_dump($age);
    echo "<br>";
    var_dump($ageJson);
    echo "<br>";

    // $ageDeco=json_decode($ageJson);
    $ageDecoTrue=json_decode($ageJson,true);
    // var_dump($ageDeco);
    echo "<br>";
    var_dump($ageDecoTrue);
?>