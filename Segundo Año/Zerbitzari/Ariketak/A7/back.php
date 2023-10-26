<!DOCTYPE html>
<html>
    <body>
<?php
    $txarto = false; //Zerbait txarto badagoen begiratzeko liburuaren erreserba egin baino lehen

    if(!empty($_POST["email"]) && strstr($_POST["email"], "@")){ //Emaila hutsik ez dagoela eta @ daukala begiratzen du.
        echo "<p>EMAILA ONDO</p>";
    } else {
        echo "<p>EMAILA TXARTO</p>";
        $txarto = true;
    }

    $nan = $_POST["nan"]; //NAN-a gordetzeko
    $nanLetraBarik = substr($nan, 0, 8); //NAN-aren zenbakia bakarrik gordetzeko, letra barik
    $nanLetra = substr($nan, 8, 9); //NAN-aren letra gordetzeko, zenbaki barik
    
    if(is_numeric($nanLetraBarik)){ //NAN-a hutsik ez dagoela begiratuko du
        $ondarra = $nanLetraBarik % 23; //NAN-aren zenbakiaren ondarra jakiteko 23 zenbakiaz zatituz
        $letra; //Ondarra erabiliz lortutako letra gordetzeko
    
        switch ($ondarra) { //23 moduluko algoritmoa erabiltzeko
            case 0:
                $letra = "T";
                break;
            case 1:
                $letra = "R";
                break;
            case 2:
                $letra = "W";
                break;
            case 3:
                $letra = "A";
                break;
            case 4:
                $letra = "G";
                break;
            case 5:
                $letra = "M";
                break;
            case 6:
                $letra = "Y";
                break;
            case 7:
                $letra = "F";
                break;
            case 8:
                $letra = "P";
                break;
            case 9:
                $letra = "D";
                break;
            case 10:
                $letra = "X";
                break;
            case 11:
                $letra = "B";
                break;
            case 12:
                $letra = "N";
                break;
            case 13:
                $letra = "J";
                break;
            case 14:
                $letra = "Z";
                break;
            case 15:
                $letra = "S";
                break;
            case 16:
                $letra = "Q";
                break;
            case 17:
                $letra = "V";
                break;
            case 18:
                $letra = "H";
                break;
            case 19:
                $letra = "L";
                break;
            case 20:
                $letra = "C";
                break;
            case 21:
                $letra = "K";
                break;
            case 22:
                $letra = "E";
                break;
            default:
                # Zenbakia ez da zuzena
                break;
        }
        
        if($nanLetra == $letra){
            echo "<p>NAN ondo</p>";
        } else{
            echo "<p>$nan NAN txarto, letra zuzena $letra da</p>";
            $txarto = true;
        }
    } else{
        echo "<p>NAN txarto</p>";
        $txarto = true;
    }

    if(!empty($_POST["data"]) && !$txarto){ //Data hutsik ez dagoela begiratzen du eta zerbait txarto egin baduzu aurretik
        $data = new DateTime($_POST["data"]); //Data formatuan gordetzen du eragiketak egin ahal izateko
        $egunak = 10; //Entrega data zehazteko zenbat egun erbailiko diren zehazteko.
        $bueltaData = $data->modify("+$egunak days"); //Entrega data gordetzeko
        
        if($bueltaData -> format("N") == 6){ //Larunbata den begiratuko du
            $bueltaData = $bueltaData -> modify("+2 days"); //2 egun gehituko dizkio entrega datari astelehenean izateko
        } elseif ($bueltaData -> format("N") == 7){ //Igandea den begiratuko du
            $bueltaData = $bueltaData -> modify("+1 days"); //Egun 1 gehituko dio entrega datari astelehenean izateko
        }
        echo "Bueltatze data: " . $bueltaData->format("Y-m-d") . "<br>";
    } else{
        echo "<p>DATA TXARTO EDO ZERBAIT TXARTO IDATZI DUZU</p>";
    }
?>
</body>