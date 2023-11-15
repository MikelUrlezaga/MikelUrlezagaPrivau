//var daw = "Desarrollo de aplicaciones web";
//alert (daw.toUpperCase());


window.name = "Mi ventana";
var texto = "A";
texto += "<br>Nombre: "+window.name;
// texto += "<br/>Ancho externo: "+window.outerWidth;
// texto += "<br/>Alto externo: "+window.outerHeight;

var pregunta = prompt("Como te llamas?", "Nombre");
texto += "<br>"+ pregunta;
var confirmar = confirm("Y te gusta meterte caña como un cabron?");
texto += "<br>" + ((confirmar) ? "ESA ES COÑO" : "COMEME LOS COJONES Y CURRA MARICON");
texto += "<br>"+ confirmar;
document.getElementById("ventana").innerHTML = texto;

function crear() {
    miVentana = window.open("","","width=500,height=200");
    miVentana.document.write("<h1>Mi ventana</h1>");
    miVentana.resizeBy(100,100);
    miVentana.moveBy(-650,400);
}
