<?php
    $telefonoa = 946186889;

    $zenbakiak=str_split($telefonoa);

    $konparaketa=$zenbakiak[0].$zenbakiak[1].$zenbakiak[2];
    echo $konparaketa;
    echo "<br>";
    
    switch ($konparaketa) {
        case '946':
                echo "Euskadi";
            break;
        
        default:
                "Ez da Euskadi";
            break;
    }

?>