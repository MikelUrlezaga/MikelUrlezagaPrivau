function kalkulatu() {
            
    //Para el presente
    var minutosP = document.getElementById("presenteMinuto").value;
    var horasP = document.getElementById("presenteHora").value;
    var diaP = document.getElementById("presenteDia").value;
    var mesP = document.getElementById("presenteMes").value;
    var añoP = document.getElementById("presenteAno").value;
    //Para el destino
    var minutosD = document.getElementById("destinoMinuto").value;
    var horasD = document.getElementById("destinoHora").value;
    var diaD = document.getElementById("destinoDia").value;
    var mesD = document.getElementById("destinoMes").value;
    var añoD = document.getElementById("destinoAno").value;
    //Variable para guardar los  minutos totales
    var minutosT = 0;
    minutosT = minutos(minutosT);
    minutosT = horas(minutosT);
    minutosT = mes(minutosT);
    minutosT = año(minutosT);
    if (minutosT == 0) {
        alert("EZ ZARA INORA JOAN");
    }
    //Variables para sacar todo
    var minutosDiferencia;
    var horasDiferencia;
    var diasDiferencia;
    var mesesDiferencia;
    var añosDiferencia;
    //Para llamar a las funciones
    minutosT = desfibrarAños(minutosT);
    minutosT = desfibrarMeses(minutosT);
    minutosT = desfibrarDias(minutosT);
    minutosT = desfribrarHoras(minutosT);
    escribir();
    //Ahora toca eenseñar
    function escribir() {
        document.getElementById("mensaje").innerHTML="Esta es la diferencia:  Años: " + añosDiferencia + ", Meses: " + mesesDiferencia + ", Dias: " + diasDiferencia + ", Horas: " + horasDiferencia + ", Minutos: " + minutosT;
    }
    //Calcular la diferencia de minutos
    function minutos(minutosT) {
        minutosT = minutosT + Math.abs(minutosD-minutosP);
        return minutosT;
    }
    //Calcular diferencia de horas en minutos
    function horas(minutosT) {
        minutosT = minutosT + Math.abs((horasD*60)-(horasP*60));
        return minutosT;
    }
    //Calcular diferencia de meses en minutos
    function mes(minutosT) {
        //Variables para el calculo diferencial
        var futuro;
        var presente;
        //Para saber cual es el numero de mes que se mete del Destino
        switch (mesD) {
            case "ENE":
                futuro = 1;
            break;
            case "FEB":
                futuro = 2;
            break;
            case "MAR":
                futuro = 3;
            break;
            case "ABR":
                futuro = 4;
            break;
            case "MAY":
                futuro = 5;
            break;
            case "JUN":
                futuro = 6;
            break;
            case "JUL":
                futuro = 7;
            break;
            case "AGO":
                futuro = 8;
            break;
            case "SEP":
                futuro = 9;
            break;
            case "OCT":
                futuro = 10;
            break;
            case "NOV":
                futuro = 11;
            break;
            case "DIC":
                futuro = 12;
            break;
        
            default:
                alert("Ta mal escrito perro");
            break;
        }
        //Lo mismo pero Presente
        switch (mesP) {
            case "ENE":
                presente = 1;
            break;
            case "FEB":
                presente = 2;
            break;
            case "MAR":
                presente = 3;
            break;
            case "ABR":
                presente = 4;
            break;
            case "MAY":
                presente = 5;
            break;
            case "JUN":
                presente = 6;
            break;
            case "JUL":
                presente = 7;
            break;
            case "AGO":
                presente = 8;
            break;
            case "SEP":
                presente = 9;
            break;
            case "OCT":
                presente = 10;
            break;
            case "NOV":
                presente = 11;
            break;
            case "DIC":
                presente = 12;
            break;
        
            default:
                alert("Ta mal escrito perro");
            break;
        }

        minutosT = minutosT + Math.abs((futuro*44640)-(presente*44640)); 

        return minutosT;
    }
    //Calcular diferencia de años en minutos
    function año(minutosT) {
        minutosT = minutosT + Math.abs((añoD*535680)-(añoP*535680));
        return minutosT;
    }
    //Ahora toca darle la vuelta a todo y sacar cuanto es todo bien puesto
    function desfibrarAños(minutosT) {
        if (minutosT > 535680) {
            añosDiferencia = minutosT/535680;
            añosDiferencia = parseInt(añosDiferencia);
            minutosT = ((minutosT/535680)-añosDiferencia);
            minutosT = minutosT * 535680;
        }else{
            añosDiferencia = 0;
        }
        return minutosT;
    }
    
    function desfibrarMeses(minutosT) {
        if (minutosT > 44640) {
            mesesDiferencia = minutosT/44640;
            mesesDiferencia = parseInt(mesesDiferencia);
            minutosT = (minutosT/44640)-mesesDiferencia;
            minutosT = minutosT * 44640; 
        }else{
            mesesDiferencia = 0;
        }
        return minutosT;
    }

    function desfibrarDias(minutosT) {
        if (minutosT > 1440){
            diasDiferencia = minutosT/1440;
            diasDiferencia = parseInt(diasDiferencia);
            minutosT = (minutosT/1440)-diasDiferencia;
            minutosT = minutosT * 1440;
        }else{
            diasDiferencia = 0;
        }
        return minutosT;
    }

    function desfribrarHoras(params) {
        if (minutosT > 60) {
            horasDiferencia = minutosT/60;
            horasDiferencia = parseInt(horasDiferencia);
            minutosT = (minutosT/60)-horasDiferencia;
            minutosT = minutosT * 60;
            minutosT = parseInt(minutosT);
        }else{
            horasDiferencia = 0;
        }
        return minutosT;
    }
}