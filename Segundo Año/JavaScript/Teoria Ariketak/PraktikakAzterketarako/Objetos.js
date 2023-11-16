var idatzi = document.getElementById("1");

//objeto numero 1

var objeto1 = {
    nombre:"Ada", 
    apellido:"Lovelace", 
    año: 1815
};

for (var propiedad in objeto1) {
    if (objeto1.hasOwnProperty(propiedad)) {
        console.log(propiedad + ": " + objeto1[propiedad]);
    }
}

//objetos numero 2 

var objeto2 = new Object();
objeto2.nombre = "Charles";
objeto2.apellido = "Babbage";
objeto2.ano = 1791;

//objeto numero 3

function objeto3 (nom, ape, an){
    this.nombre = nom;
    this.apellido = ape;
    this.ano = an;
} 
var ada = new objeto3 ("Ada", "Lovelace", 1815);
var babbage = new objeto3 ("Charles", "Babbage", 1791);


for (x in objeto1){
    idatzi.innerHTML += (objeto1[x]);
    idatzi.innerHTML += "<br>";
}





// un objeto clasico

var obj = {atrib1: "hola", atrib2: "jeje"};

for (const key in obj) {
    console.log(obj[key]);
}



var persona1 = {nombre:"Ada", 
apellido:"Lovelace",
nombreCompleto: function(){
    return this.nombre + " " + this.apellido;
    }
};
alert (persona1.nombre);
alert (persona1.apellido);
alert (persona1.nombreCompleto());