use strict;
const ongietorriMezua = Ongi etorri kalkulu-programara!;
jarraitu = true;

function zenbakiakLortu() {
  do {
var sartutakoZenb = [];
    	zenb = prompt("Mesedez, sartu zenbaki bat:");
    	if (isNaN(zenb)) {
      alert("Hori ez da baliozko zenbakia. Saiatu berriro.");
    } else {
      sartutakoZenb.push();
    }
    jarraitu = confirm("Beste zenbaki bat sartu nahi duzu?");
  } while (jarraitu);
}

zenbakiakLortu();

function batazbestekoaKalkulatu() {
  let gehiketa;
  let batazbestekoa;

  for (let i; i <= zenbakiak.length; i++) {
    gehiketa =+ zenbakiak[i];
  }

  batazbestekoa = gehiketa / zenbakiak.length;
  return batazbestekoa;
}

let batazbestekoa = batazbestekoaKalkulatu();

if (batazbestekoa >= 5) {
  alert("Sartutako zenbakien batez bestekoa 5 baino txikiagoa da: " + batazbestekoa);
} else {
  alert("Sartutako zenbakien batez bestekoa 5 edo handiagoa da: " + batazbestekoa);
}

