var ordua = document.getElementById("1");
var kronometroa = document.getElementById("2");
var idazteko = document.getElementById("3");
var intervalo;

function mostrarHora() {
    var horaActual = new Date();

    var horas = horaActual.getHours();
    var minutos = horaActual.getMinutes();
    var segundos = horaActual.getSeconds();
    ordua.innerHTML= horas+":"+minutos+":"+segundos;
}
setInterval(mostrarHora, 1000);
//para guardar
var horasK = 0;
var minutosK = 0;
var segundosk = 0;
//para enseñar
var erakutsiH;
var erakutsiM;
var erakustiS;

function denbora() {

    segundosk++;

    if (segundosk == 60) {
        minutosK++;
        segundosk = 0;
    }

    if (minutosK == 60) {
        horasK++;
        segundosk=0;
        minutosK=0;
    }

    erakustiS=segundosk;
    erakutsiM=minutosK;
    erakutsiH=horasK;

    if (erakustiS < 10) {
        erakustiS="0"+erakustiS;
    }

    if (erakutsiM < 10){
        erakutsiM="0"+erakutsiM;
    }

    if (erakutsiH < 10) {
        erakutsiH="0"+erakutsiH;
    }

    kronometroa.innerHTML= erakutsiH + ":" + erakutsiM + ":" + erakustiS;
}

function hasi() {
    intervalo=setInterval(denbora,1000);
}

function parar() {
    clearInterval(intervalo);
}

function gorde() {
    if (erakutsiH == 0 && erakutsiM == 0 && erakustiS == 0) {
        idazteko.innerHTML += `
        <p>00:00:00</p>
        `
    } else{
        idazteko.innerHTML += `
        <p>${erakutsiH}:${erakutsiM}:${erakustiS}</p>
        `
    }
    segundosk=0;
    minutosK=0;
    horasK=0;

    erakustiS=0;
    erakutsiM=0;
    erakutsiH=0;

    kronometroa.innerHTML= "00:00:00";
}

datos.innerHTML +=`
<h1>Es mas pequeño</h1>
`