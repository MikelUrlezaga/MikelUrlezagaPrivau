var texto ="España se ha proclamado campeona del Eurobasket después de derrotar a Francia (88-76) en la gran final de Berlin";
var palabras = texto.split(" ");

//Zenbat letra ditu esaldiak?
var letras = texto.split("");

//Zer karakter du 25. posizioak?
var cantidadDePalabras = palabras.length;
var cantidadDeLetras = letras.length;

alert("El texto tiene " + cantidadDePalabras + " palabras.");
alert("El texto tiene " + cantidadDeLetras + " letras.");
alert(texto[26]);
//Zein posiziotan dago lehenengo d letra? Eta azken d letra? Nola lortuko zenuke bigarren d letra ateratzea?
var primeraD = texto.indexOf("d");

if (primeraD !== -1) {
  alert("La primera 'd' se encuentra en la posición " + primeraD);
} else {
  alert("La letra 'd' no se encontró en el texto.");
}
//
var ultimaD;

for (let i = texto.length - 1; i >= 0; i--) {
  if (texto[i] == "d") {
    ultimaD = i;
    break;
  }
}
alert(ultimaD);
//
var segundaD;
var posicion = 0;

for(let i = 0; i<=texto.length; i++){
  if (texto[i]=="d"){
    posicion ++;
    if(posicion == 2){
      alert(i + " da bigarren d-ren posizioa");
      break;
    }
  }
}
//Zer posizioan dago "Eurobasket" hitza?
var posicion = palabras.indexOf("Eurobasket");

if (posicion !== -1) {
  alert("Palabra en posicion : " + posicion);
} else {
  alert("Not found");
}
//Nola dakizu esaldian «Portugal» hitza existitzen den?
var posicionP = palabras.indexOf("Portugal");

if (posicionP !== -1) {
alert("Palabra en posicion : " + posicionP);
} else {
alert("Not found");
}
//Nola dakizu esaldia Berlin hitzarekin hasten edo amaitzen den?
if (palabras[0]=="Berlin") {
  alert("Berlin hitzarekin hasten da esaldia");
} if (palabras[palabras.length-1]=="Berlin") {
  alert("Berlin hitzaren amaieran dago");
} else {
  alert("Berlin ez dago ez amaieran ez hasieran");
}
//Gehitu «2022ko irailaren 18an» esaldiari, eta gorde guztia aldagai batean.

texto += " 2022ko irailaren 18an";
alert(texto);
//Aurreko esalditik 26 eta 35 posizioen artean dauden letrak atera.
var ateratzekoTestua = "";
for(let i=0; i<=letras.length;i++){
  if (i >= 25 && i <= 34) {
    ateratzekoTestua += letras[i];
  }
}
alert(ateratzekoTestua);
//Aurreko esalditik 40. posiziotik aurrera dauden letrak atera.
var aurreraTestua = "";
for(let i=0; i<=letras.length;i++){
  if (i>=39) {
    aurreraTestua += letras[i];
  }
}
alert(aurreraTestua);
//Gehitu esaldiari 5 zuriune aurretik eta 10 zuriune atzetik. Gero, zuriune horiek ezabatuko dituen metodoa bilatu, zenbat dauden zehatz-mehatz adierazi beharrik izan gabe.
texto = "     "+texto+"          ";
texto = texto.trim();
alert(texto);
//Esaldia letra xehe bihuru. Eta gero letra larri.
textoXehe = texto.toLowerCase();
textoMayus = texto.toUpperCase();
alert("Texto Xehea: \n" + textoXehe + "\nTexto Mayus:\n" +textoMayus);
//Esaldia array bihurtu, non posizio bakoitzak hitz bat duen, metodo bakarra erabiliz.

//var palabras = texto.split(" ");

//Aurreko arraytik 0, 6 eta 11 posizioak atera.
alert(palabras[0]+ " "+palabras[6]+" "+palabras[11]);


