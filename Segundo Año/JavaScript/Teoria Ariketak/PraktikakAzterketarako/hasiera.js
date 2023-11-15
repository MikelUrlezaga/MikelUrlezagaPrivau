function holamundo(){
	//alert("Hola, mundo");
}

var aldaketa = true;

function egin(){
    if (aldaketa) {
        document.getElementById("1").innerHTML = "Cambio";
    } else {
        document.getElementById("1").innerHTML = "JEJE";
    }
    aldaketa = !aldaketa;
}