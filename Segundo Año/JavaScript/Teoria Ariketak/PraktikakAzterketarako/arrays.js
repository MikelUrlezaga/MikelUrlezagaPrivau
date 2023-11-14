var animales = ["Perro", "Gato", "Hamster"]; 
var primero = animales[0];
alert(primero);

document.write(animales);

document.write("<br/><br/>Todos los elementos:")
for (var i=0; i<animales.length; i++){
    document.write("<br/>"+animales[i]);
}

document.write("<br/>El array en tipo String es: "+animales.toString());

document.write("<br/>La primera posición de Gato es: "+animales.indexOf("Gato"));

animales.sort();

document.write("<br/>La primera posición de Gato es: "+animales.indexOf("Gato"));

