function holamundo(){
	//alert("Hola, mundo");
}

var aldaketa = true;

function egin(){
    if (aldaketa) {
        document.getElementById("1").innerHTML = "Cambio";
    } else {
        document.getElementById("1").innerHTML = "JEJE";
    }
    aldaketa = !aldaketa;
}

// otra manera de guardar las funciones 

var producto = function(a){
    return a;
}

var resultado = producto(5);

// otra manera es con constructor

var miFuncion = new Function ("a", "b", "return a*b;");
var resultado2 = miFuncion(5,7);
console.log(resultado2);

// si algun parametro no esta definido

function suma (a, b){
    if (b === undefined)
        b = 0;
    return a + b;
}

var resultado2 = suma (4);
console.log(resultado2 + " Esto funciona");

var siuuu = 10;

switch (true) {
    case siuuu < 5:
        console.log("mal");
        break;
    case siuuu === 5:
        console.log("bien");
        break;
    case siuuu > 5:
        console.log("Puto amo");
        break;
    default:
        console.log("No es una nota crack");
        break;
}
//para recorrer arrays
var array = ["Kaixo", "Ni", "Mikel", "Naiz"];                                             
for (let index = 0; index < array.length; index++) {
    const element = array[index];
    console.log(element);
}
//el for clasico
for(let i = 0; i <= 4 ; i++){
    console.log("Saludo Numero " + (i+1));
}
// para recorrer objetos
var animal = {nombre:"Lola", tipo:"Hamster", raza:"Ruso", edad:1};

var prop;

for (prop in animal){
    console.log(animal.prop);
}
//


