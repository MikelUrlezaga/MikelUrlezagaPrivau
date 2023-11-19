window.addEventListener("load", llamadaFetch);

function llamadaFetch(){
    let options = {method: "GET", mode: 'cors'};
    fetch("https://pokeapi.co/api/v2/pokemon/ditto",options)
        .then(data => {
            console.log(data);
            return data.json();
        })
        .then(response => {
            console.log(response);
        });
}