var ordua = document.getElementById("1");

function mostrarHora() {
    var horaActual = new Date();

    var horas = horaActual.getHours();
    var minutos = horaActual.getMinutes();
    var segundos = horaActual.getSeconds();
    ordua.innerHTML= horas+":"+minutos+":"+segundos;
}
setInterval(mostrarHora, 1000);



function hasi() {
    
}

function parar() {
    
}

function gorde() {
    
}

