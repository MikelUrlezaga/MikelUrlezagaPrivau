var a = 0;

function funPrimerBoton() {
    var boton1 = document.getElementById("primerBoton");
    var div1 = document.getElementById("div1");
    
    
    if (a == 0) {
        var textoBoton1 = document.createTextNode("WUALAAA");
        boton1.textContent = "";
        boton1.appendChild(textoBoton1); 
    }

    if (a==1) {
        var primeraP = document.createElement("p");
        var textoDeLaP = document.createTextNode("A que Mola :P jeje");
        primeraP.appendChild(textoDeLaP);
        div1.appendChild(primeraP);
    }

    if (a==2) {
        var textoBoton1 = document.createTextNode("Eligeme una de las siguientes opciones");
        boton1.textContent = "";
        boton1.appendChild(textoBoton1);
        div1.removeChild(div1.firstChild);
    }
    a++;
    
}