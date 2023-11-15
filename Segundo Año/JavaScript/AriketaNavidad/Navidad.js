var palabra = ["ADADBajbdhajd","sbhaudfasgbdfuyhas","asdvhsadgsdgu","abhsdkjsbakdjh"];
for (let a = 0; a < palabra.length; a++) {
    var palabraSeparada = palabra[a].split("");
    var zenbat = palabraSeparada.length;
    escribir = document.getElementById("1");

    for (let index = 1; index <= zenbat; index++) {
        escribir.innerHTML += "*";
    }
    escribir.innerHTML+= "n/";
    for(let i = 0;i<zenbat; i++){
        escribir.innerHTML += palabraSeparada[i];
    }
    escribir.innerHTML+= "\\n";
    for (let index = 1; index <= zenbat; index++) {
        escribir.innerHTML += "*";
    }
    escribir.innerHTML+="\n";
}
