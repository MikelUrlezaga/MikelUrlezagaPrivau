window.addEventListener('load', () => {
    let informazioa = document.getElementsByClassName('informazioa')[0];
    let izena = document.getElementById('izena');
    let email = document.getElementById('email');
    let gaia = document.getElementById('gaia');
    let baliozkotu = document.getElementById('baliozkotu');
    informazioa.style.display = 'none';

    baliozkotu.addEventListener('click', () => {
        if (!baliozkotuAldagaia(izena, 1)) {
            izena.style.borderColor = 'red';
            izena.style.color = 'red';
            izena.focus();
        } else {
            izena.style.borderColor = 'black';
            izena.style.color = 'black';
        }

        if (!baliozkotuAldagaia(email, 2)) {
            email.style.borderColor = 'red';
            email.style.color = 'red';
            email.focus();
        } else {
            email.style.borderColor = 'black';
            email.style.color = 'black';
        }

        if (baliozkotuAldagaia(izena, 1) && baliozkotuAldagaia(email, 2)) {
            informazioa.style.display = 'block';
        }

    });
    gaia.addEventListener('change', () => {
        let info = document.createElement("h2");
        let ciclo = document.createElement("p");
        var formulario = document.getElementsByTagName("form")[0];
        formulario.appendChild(info);
        formulario.appendChild(ciclo);
        let infotext = document.createTextNode(izena.value + "," + email.value);
        let ciclotext = document.createTextNode(gaia.value);
        info.appendChild(infotext);
        ciclo.appendChild(ciclotext);
    });
});

function baliozkotuAldagaia(eremua, mota) {

    let baliozkoa = false;

    switch(mota) {
        case 1: 
            if (eremua.value != "" && eremua.value.length < 20) {
                baliozkoa = true;
            }
            break;
        case 2: 
            if (eremua.value != "" && eremua.value.includes('@gmail.com')) {
                baliozkoa = true
            }
            break;
    }

    return baliozkoa;
}