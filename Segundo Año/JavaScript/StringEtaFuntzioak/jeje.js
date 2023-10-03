var texto ="España se ha proclamado campeona del Eurobasket después de derrotar a Francia (88-76) en la gran final de Berlin";
//Separar las palabras
var palabras = texto.split(" ");
var letras = texto.split("");
//array-aren luzera
var cantidadDePalabras = palabras.length;
var cantidadDeLetras = letras.length;
//erakutsi
alert("El texto tiene " + cantidadDePalabras + " palabras.");
alert("El texto tiene " + cantidadDeLetras + " letras.");
alert(texto[26]);

var primeraD = texto.indexOf("d");
//si no se encuentra nada, el valor default es (-1)
if (primeraD !== -1) {
  alert("La primera 'd' se encuentra en la posición " + primeraD);
} else {
  alert("La letra 'd' no se encontró en el texto.");
}

// Buscar la posición de la palabra en el arreglo de palabras
var posicion = palabras.indexOf("Eurobasket");
//si no se encuentra nada, el valor default es (-1)
if (primeraD !== -1) {
  alert("Palabra en posicion : " + posicion);
} else {
  alert("Not found");
}
//Para sacar una palabra
alert(palabras[2]);
