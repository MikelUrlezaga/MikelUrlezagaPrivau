// var frase = "La noche se avecina, ahora empieza mi guardia. No terminará hasta el día de mi muerte. No tomaré esposa, no poseeré tierras, no engendraré hijos. No llevaré corona, no alcanzaré la gloria. Vivire y morire en mi puesto. Soy la espada en la oscuridad. Soy el vigilante del Muro. Soy el fuego que arde contra el frío, la luz que trae el amanecer, el cuerno que despierta a los durmientes, el escudo que defiende los reinos de los hombres. Entrego mi vida y mi honor a la Guardia de la Noche,durante esta noche y todas las que estén por venir.";
var frase = document.getElementById('1');

var texto = frase.textContent;
var palabras = texto.split(" ");

for (let i = 0; i <= palabras.length; i++){
    if (palabras[i]=="NO" || palabras[i]=="No" || palabras[i]=="nO" || palabras[i]=="no") {
        palabras[i]="";    
    }
}

var erantzuna = "";
console.log(palabras);
for (let i = 0; i < palabras.length; i++){
    erantzuna += palabras[i];
    erantzuna += " ";
}

console.log(erantzuna);
// escribir.innerHTML=erantzuna;
var escribir = document.getElementById('2');
escribir.innerHTML = erantzuna;
