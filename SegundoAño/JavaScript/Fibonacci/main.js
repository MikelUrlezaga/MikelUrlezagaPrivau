var zenbakia1 = 0;
var zenbakia2 = 1;
var triangularra;
var errepikapena = 0;

function segida() {
var zenbat = document.getElementById("Zenbakia").value;
var idazteko = document.getElementById("idatzi");
if (zenbat != 1) {
    if (zenbat != 2) {
        if (errepikapena == 0) {
            idazteko.innerHTML+=`
            <p> ${zenbakia1} </p>
            `;
            idazteko.innerHTML+=`
            <p> ${zenbakia2} </p>
            `;
        }
        triangularra = zenbakia1 + zenbakia2;
        zenbakia1 = zenbakia2;
        zenbakia2 = triangularra;
        if (errepikapena < (zenbat-3)) {
            idazteko.innerHTML+=`
            <p> ${zenbakia2} </p>
            `;
            errepikapena++;
            segida();
        }else{
            idazteko.innerHTML+=`
            <p> ${zenbakia2} </p>
            `;
        }
    }
    else{
        idazteko.innerHTML+=`
        <p> ${zenbakia1} </p>
        `;
        idazteko.innerHTML+=`
        <p> ${zenbakia2} </p>
        `;
    }
}
else{
    idazteko.innerHTML+=`
    <p> ${zenbakia1} </p>
    `;
}
}

