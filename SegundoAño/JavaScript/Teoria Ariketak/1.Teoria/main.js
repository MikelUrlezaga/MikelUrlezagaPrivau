alert("Buenas");

var nombre="Mikel";
var numero=5;


var datos = document.getElementById("datos");
datos.innerHTML = `
    <h1>Prueba de html</h1>
    <h2>Prueba: ${nombre}</h2>
`
;

if (5 < 10) {
    datos.innerHTML += `
    <h1>Es mas grande</h1>
    `
}else{
    datos.innerHTML +=`
    <h1>Es mas pequeño</h1>
    `
}


for(let i = 0; i<= 5; i++){
    datos.innerHTML += "<h2>Numeros : </h2>" + i;
}

function muestraminombre(nombre) {
    var misDatos = `
    <h1>Prueba de html</h1>
    <h2>Prueba: ${nombre}</h2>
`
return misDatos;
}

function seguir() {
    datos.innerHTML += muestraminombre("Julen es el nombre de mi hermano");
}

seguir();


var nombres = ["Mikel","Asier","Jon"];
alert(nombres[0]);


for(let i = 0; i < nombres.length; i++){
    datos.innerHTML += nombres[i] + "</br>";
}

datos.innerHTML += `
<hr/>
`
;

nombres.forEach(
    function(nombre){
        datos.innerHTML+= nombre + "<br/>";
    }
);

