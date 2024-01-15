document.addEventListener('DOMContentLoaded', () => {

    const apiUrl = 'fetch.json';


    const pokemonDetailsContainer = document.getElementById('pokemon-details');


    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {

            const pokemon = data[0];

            const pokemonHTML = `
                <h2>${pokemon.name}</h2>
                <p>ID: ${pokemon.id}</p>
                <p>Altura: ${pokemon.height} dm</p>
                <p>Peso: ${pokemon.weight} hg</p>
                <p>Color: ${pokemon.species.color.name}</p>
                <img src="${pokemon.species.varieties[0].pokemon.url}.png" alt="${pokemon.name}">
            `;

            pokemonDetailsContainer.innerHTML = pokemonHTML;
        })
        .catch(error => {
            console.error('Error al obtener los datos del Pokemon:', error);
        });
});
