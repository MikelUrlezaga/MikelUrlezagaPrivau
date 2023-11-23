<?php
    //quitar
    include "..\db.php";
    $pertsonak = array(
        "Jon" => array("abizena" => "Lopez", "adina" => 25, "soldata" => 30000),
        "Ane" => array("abizena" => "Garcia", "adina" => 30, "soldata" => 35000),
        "Mikel" => array("abizena" => "Etxeberria", "adina" => 22, "soldata" => 28000),
        "Maite" => array("abizena" => "Fernandez", "adina" => 35, "soldata" => 40000),
        "Eider" => array("abizena" => "Aguirre", "adina" => 28, "soldata" => 32000),
        "Iker" => array("abizena" => "Landa", "adina" => 40, "soldata" => 45000),
        "Leire" => array("abizena" => "Mendizabal", "adina" => 29, "soldata" => 38000),
        "Unai" => array("abizena" => "Ibarra", "adina" => 27, "soldata" => 36000),
        "Nerea" => array("abizena" => "Gonzalez", "adina" => 33, "soldata" => 42000),
        "Aitor" => array("abizena" => "Santos", "adina" => 21, "soldata" => 28000),
        "Amaia" => array("abizena" => "Uriarte", "adina" => 38, "soldata" => 40000),
        "Eneko" => array("abizena" => "Larrea", "adina" => 26, "soldata" => 35000),
        "Irati" => array("abizena" => "Martinez", "adina" => 32, "soldata" => 38000),
        "Asier" => array("abizena" => "Ortega", "adina" => 23, "soldata" => 32000),
        "Ainara" => array("abizena" => "Zubizarreta", "adina" => 31, "soldata" => 36000),
        "Inaki" => array("abizena" => "Bilbao", "adina" => 42, "soldata" => 45000),
        "Naiara" => array("abizena" => "Azkuenaga", "adina" => 27, "soldata" => 32000),
        "Gorka" => array("abizena" => "Egiguren", "adina" => 24, "soldata" => 28000),
        "Miren" => array("abizena" => "Arriola", "adina" => 36, "soldata" => 40000),
        "Xabier" => array("abizena" => "Garmendia", "adina" => 29, "soldata" => 38000),
        "Haizea" => array("abizena" => "Urizar", "adina" => 25, "soldata" => 30000),
        "Iratxe" => array("abizena" => "Artetxe", "adina" => 34, "soldata" => 36000),
        "Egoitz" => array("abizena" => "Sanchez", "adina" => 40, "soldata" => 45000),
        "Garazi" => array("abizena" => "Larrazabal", "adina" => 22, "soldata" => 28000),
        "Mikel" => array("abizena" => "Gomez", "adina" => 28, "soldata" => 32000),
        "Leire" => array("abizena" => "Arocena", "adina" => 39, "soldata" => 42000),
        "Aritz" => array("abizena" => "Lopez", "adina" => 33, "soldata" => 40000),
        "Nekane" => array("abizena" => "Izagirre", "adina" => 30, "soldata" => 36000),
        "Oier" => array("abizena" => "Egana", "adina" => 31, "soldata" => 38000),
        "Ane" => array("abizena" => "Garmendia", "adina" => 24, "soldata" => 28000)
    );
?>

<table border=1>
    <tr>
        <th>Izena</th><th>Abizena</th><th>Adina</th><th>Soldata</th>
    </tr>
    <?php $db = new DB ("192.168.202.104", "azterketa", "123", "E1Alba"); 
        foreach ($pertsonak as $izena => $pertsona){ 
            if ($izena[0]=="M"){    
    ?>
    <tr>
        <td><?php echo $izena ?></td> <td><?php echo $pertsona["abizena"] ?> </td> <td> <?php echo $pertsona["soldata"] ?></td> <td> <?php echo $pertsona["soldata"] ?> </td>
    </tr>
    <?php 
                $sql = "INSERT INTO a1 (izena, abizenak, adina, soldata) VALUES ('".$izena."','".$pertsona["abizena"]."',".$pertsona["adina"].",".$pertsona["soldata"].")";
        //echo $sql."<br>";
                $db->insert($sql);
            }
        }
    ?>
</table>