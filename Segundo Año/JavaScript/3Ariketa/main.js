//Textua non kokatuko den aldagaia
var galdera = document.getElementById("galdera");

//Aldagaiak jakitzeko galdera egin den ala ez
var geo = 0;
var art = 0;
var ikus = 0;
var his = 0;
var zien = 0;
var kir = 0;

//Galderak kontuan hartzen dituen aldagaia
var zenbat = 0;

//Ondo dauden erantzunak kontuan hartzen dituen aldagaia
var ondo = 0;

//Geologiarako funtzioa
function galdera1() {
    if (geo == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cuantos continentes hay en el mundo?</h2>
                <button type="button" onclick="botoiOna()">7</button>
                <button type="button" onclick="botoiTxarra()">3</button>
                <button type="button" onclick="botoiTxarra()">8</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>Cual es la longitud del rio Amazonas en kilometros?</h2>
                <button type="button" onclick="botoiTxarra()">5000</button>
                <button type="button" onclick="botoiOna()">6,400</button>
                <button type="button" onclick="botoiTxarra()">6969</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cuantos paises comparten una frontera con Francia?</h2>
                <button type="button" onclick="botoiOna()">8</button>
                <button type="button" onclick="botoiTxarra()">6</button>
                <button type="button" onclick="botoiTxarra()">7</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    geo++;
    return geo;
}

//Arterako funtzioa
function galdera2() {
    if (art == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cuantos cuadros pinto Leonardo da Vinci en su vida?</h2>
                <button type="button" onclick="botoiOna()">20</button>
                <button type="button" onclick="botoiTxarra()">15</button>
                <button type="button" onclick="botoiTxarra()">25</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>Cuantas teclas tiene un piano estandar de 88 teclas?</h2>
                <button type="button" onclick="botoiTxarra()">89</button>
                <button type="button" onclick="botoiOna()">88</button>
                <button type="button" onclick="botoiTxarra()">2</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cuantos metros cuadrados tiene la superficie de la Mona Lisa?</h2>
                <button type="button" onclick="botoiOna()">0.2027</button>
                <button type="button" onclick="botoiTxarra()">Kampo Furbolakue</button>
                <button type="button" onclick="botoiTxarra()">0.3022</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    art++;
    return art;
}

//Ikuskizunerako funtzioa
function galdera3() {
    if (ikus == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cual es la duracion en minutos de la pelicula "El Padrino"?</h2>
                <button type="button" onclick="botoiOna()">175</button>
                <button type="button" onclick="botoiTxarra()">160</button>
                <button type="button" onclick="botoiTxarra()">185</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>Cual es la pelicula preferida del genio del furbo mundial y futuro governador del mundo, Don Mikel Urlezaga?</h2>
                <button type="button" onclick="botoiTxarra()">Pudin Magikoa</button>
                <button type="button" onclick="botoiOna()">Bad Boys 2</button>
                <button type="button" onclick="botoiTxarra()">Jhon Wick 3</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cuantos filmes conforman la trilogia original de "Indiana Jones" dirigida por Steven Spielberg?</h2>
                <button type="button" onclick="botoiOna()">3</button>
                <button type="button" onclick="botoiTxarra()">2</button>
                <button type="button" onclick="botoiTxarra()">4</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    ikus++;
    return ikus;
}

//Historiarako funtzioa
function galdera4() {
    if (his == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cuantos años duro la Guerra de los Cien Años?</h2>
                <button type="button" onclick="botoiOna()">116</button>
                <button type="button" onclick="botoiTxarra()">100</button>
                <button type="button" onclick="botoiTxarra()">120</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>En que año cayo el Muro de Berlin?</h2>
                <button type="button" onclick="botoiTxarra()">2023</button>
                <button type="button" onclick="botoiOna()">1989</button>
                <button type="button" onclick="botoiTxarra()">1988</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cuantos años duro la Revolucion Francesa?</h2>
                <button type="button" onclick="botoiOna()">10</button>
                <button type="button" onclick="botoiTxarra()">12</button>
                <button type="button" onclick="botoiTxarra()">8</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    his++;
    return his;
}

//Zientziarako funtzioa
function galdera5() {
    if (zien == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cual es la velocidad de la luz en el vacio en metros por segundo?</h2>
                <button type="button" onclick="botoiOna()">299,792,458</button>
                <button type="button" onclick="botoiTxarra()">299,792,457</button>
                <button type="button" onclick="botoiTxarra()">299,792,458,669</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>Cuantos huesos tiene un adulto humano promedio?</h2>
                <button type="button" onclick="botoiTxarra()">150</button>
                <button type="button" onclick="botoiOna()">206</button>
                <button type="button" onclick="botoiTxarra()">195</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cuantas capas principales componen la atmosfera de la Tierra?</h2>
                <button type="button" onclick="botoiOna()">5</button>
                <button type="button" onclick="botoiTxarra()">4</button>
                <button type="button" onclick="botoiTxarra()">6</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    zien++;
    return his;
}

//Kirolerako funtzioa
function galdera6() {
    if (kir == 0) {
        var zenbakia = Math.floor(Math.random() * 3) + 1;
        switch (zenbakia) {
            case 1:
                galdera.innerHTML = `
                <h2>Cuántos jugadores hay en un equipo de fútbol en el campo durante un partido?</h2>
                <button type="button" onclick="botoiOna()">11</button>
                <button type="button" onclick="botoiTxarra()">25</button>
                <button type="button" onclick="botoiTxarra()">3</button>
                `
                break;
            case 2:
                galdera.innerHTML = `
                <h2>Cuantos puntos otorga un touchdown en el futbol americano (sin incluir los puntos adicionales)?</h2>
                <button type="button" onclick="botoiTxarra()">3</button>
                <button type="button" onclick="botoiOna()">6</button>
                <button type="button" onclick="botoiTxarra()">9</button>
                `
                break;
            case 3:
                galdera.innerHTML = `
                <h2>Cual es la longitud estandar de una pista de atletismo en metros?</h2>
                <button type="button" onclick="botoiOna()">400</button>
                <button type="button" onclick="botoiTxarra()">500</button>
                <button type="button" onclick="botoiTxarra()">1000</button>
                `
                break;
            default:
                alert("Errorea hausasko zenbakiaren lorpenean");
                break;
        }  
    }else{
        alert("Galdera hau eginda duzu");
    }
    kir++;
    return kir;
}

//Erantzuna ona denerako funtzioa
function botoiOna() {
    ondo++;
    zenbat++;
    if (zenbat == 6) {
        if (ondo >= 4) {
            alert("IRABAZI DUZU");
        }else{
            alert("SEGUI IKASTEN, GALDU DUZU BAINA HURRENGOAN SEGURU EGINGO DUZULA HOBETO");
        }
    }
    else{
        galdera.innerHTML = `
        <p id="galdera"></p>
        `
    }
}

//Erantzun okerra denerako funtzioa
function botoiTxarra() {
    ondo = ondo;
    zenbat++;
    if (zenbat == 6) {
        if (ondo >= 4) {
            alert("IRABAZI DUZU");
        }else{
            alert("SEGUI IKASTEN, GALDU DUZU BAINA HURRENGOAN SEGURU EGINGO DUZULA HOBETO");
        }
    }
    else{
        galdera.innerHTML = `
        <p id="galdera"></p>
        `
    }
}