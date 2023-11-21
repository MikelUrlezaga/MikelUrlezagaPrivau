"use strict";
const ongietorriMezua = "Ongi etorri kalkulu-programara!";
var jarraitu = true;
var sartutakoZenb = [];

function zenbakiakLortu() {
  do {
    	var zenb = prompt("Mesedez, sartu zenbaki bat:");
      parseInt(zenb);
    	if (isNaN(zenb)) {
      alert("Hori ez da baliozko zenbakia. Saiatu berriro.");
    } else {
      sartutakoZenb.push(zenb);
    }
    jarraitu = confirm("Beste zenbaki bat sartu nahi duzu?");
  } while (jarraitu);
}

zenbakiakLortu();

function batazbestekoaKalkulatu() {
  let gehiketa = 0;
  let batazbestekoa;

  for (let i=0; i < sartutakoZenb.length; i++) {
    gehiketa += parseInt(sartutakoZenb[i]);
    console.log(sartutakoZenb[i]);
  }
  console.log(gehiketa);
  batazbestekoa = gehiketa / sartutakoZenb.length;
  return batazbestekoa;
}

let batazbestekoa = batazbestekoaKalkulatu();

if (batazbestekoa >= 5) {
  alert("Sartutako zenbakien batez bestekoa 5 baino txikiagoa da: " + batazbestekoa);
} else {
  alert("Sartutako zenbakien batez bestekoa 5 edo handiagoa da: " + batazbestekoa);
}

