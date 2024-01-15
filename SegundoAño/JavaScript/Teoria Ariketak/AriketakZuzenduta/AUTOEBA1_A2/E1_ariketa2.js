
function no_ezabatu() {
    var array = document.getElementById("testua").innerHTML.split(" ");
    for (let i = 0; i < array.length; i++) {
        if (array[i].toUpperCase() == "NO") {
            array.splice(i,1);
        }
    }
    document.getElementById("testua").innerHTML = "";
    for (let i = 0; i < array.length; i++) {
        document.getElementById("testua").innerHTML += array[i];
        document.getElementById("testua").innerHTML += " ";
    }
}

function hitzaZenbatu() {
    var testuaArray = document.getElementById("testua").innerHTML.split(" ");
    var hitza = window.prompt("Sartu bilatu nahi duzun hitza: ");
    let kont = 0;
    for (let i = 0; i < testuaArray.length; i++) {
        if (testuaArray[i].toUpperCase() == hitza.toUpperCase()) {
            kont++;
        }
    }
    alert(hitza + " hitza " + kont + " alditan agertzen da testuan.");
}

