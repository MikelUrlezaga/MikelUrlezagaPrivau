"use strict";   //Comillas

const datuakEskatu = "Gehitu zenbaki bat.";

const galdera = "Beste zenbaki bat sartu nahi duzu?";

var datuakLortu = function () {
    let datuak = [];
    do {
        datuak.push(prompt(datuakEskatu));
    } while (confirm(galdera))
    return datuak;
}

var datuakKalkulatu = function (array) {
    let emaitza = 0;
    let kopurua = 0;
    for (let i = 0; i < array.length; i++) {
        emaitza += Number(array[i]);
        kopurua++;
    }

    emaitza = emaitza / kopurua;

    return emaitza;

}

let datuak = datuakLortu();

alert(datuakKalkulatu(datuak));