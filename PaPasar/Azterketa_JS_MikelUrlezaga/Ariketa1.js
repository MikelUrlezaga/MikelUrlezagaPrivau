"use strict";  // "" beharrezkoak
const ongietorriMezua = "Ongi etorri kalkulu-programara!";//"" beharrezkoak dira texturako
alert(ongietorriMezua); // pantailatik ikusteko
var jarraitu = true; // aldagaia definitu behar da "var"
var sartutakoZenb = []; // funtziotik kanpora atera denbora guztian ez sortzeko
function zenbakiakLortu() {
do {
var zenb = prompt("Mesedez, sartu zenbaki bat:"); // zenb definitu behar da "var,let,etc"
console.log(zenb);
if (isNaN(zenb)) {
alert("Hori ez da baliozko zenbakia. Saiatu berriro.");
} else {
Number(zenb); //zenbakira bihurtzeko
sartutakoZenb.push(zenb);//datua sartu behar da push() egiterakoan
}
jarraitu = confirm("Beste zenbaki bat sartu nahi duzu?");
} while (jarraitu);
}
zenbakiakLortu();
var batazbestekoaAteratzeko = batazbestekoaKalkulatu(); //return-ak bueltatutakoa gordetzeko
Number(batazbestekoaAteratzeko);
batazbestekoaAteratzeko = sartutakoZenb[0];
function batazbestekoaKalkulatu() {
var gehiketa;
var batazbestekoa;
var zenbakiaSuma;
for (let i = 0; i <= sartutakoZenb.length; i++) {  // array txarto zegoen jarrita, sartutakoZenb[] da, gainera i = 0 falta zen
Number(zenbakiaSuma); //zenbakira bihurtzeko
zenbakiaSuma += sartutakoZenb[i]; // array-a txarto
}
batazbestekoa = zenbakiaSuma / sartutakoZenb.length; // array-a txarto
Number(batazbestekoa); // zenbakira bihurtzeko
return batazbestekoa;
}
if (batazbestekoaAteratzeko >= 5) {
alert("Sartutako zenbakien batez bestekoa 5 baino txikiagoa da: " +
batazbestekoaAteratzeko);
} else {
alert("Sartutako zenbakien batez bestekoa 5 edo handiagoa da: " +
batazbestekoaAteratzeko);
}