document.addEventListener('DOMContentLoaded', () => {
    // URL del archivo JSON o de la API que contiene los datos del Pokemon
    const apiUrl = 'fetch.json';

    // Selecciona el elemento HTML donde se mostrarán los detalles del Pokemon
    const pokemonDetailsContainer = document.getElementById('pokemon-details');

    // Realiza la solicitud (fetch) al servidor
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            // Procesa los datos y crea el contenido HTML
            const pokemon = data[0]; // Suponiendo que solo hay un Pokemon en el JSON

            const pokemonHTML = `
                <h2>${pokemon.name}</h2>
                <p>ID: ${pokemon.id}</p>
                <p>Altura: ${pokemon.height} dm</p>
                <p>Peso: ${pokemon.weight} hg</p>
                <p>Color: ${pokemon.species.color.name}</p>
                <img src="${pokemon.species.varieties[0].pokemon.url}.png" alt="${pokemon.name}">
            `;

            // Inserta el contenido HTML en el contenedor
            pokemonDetailsContainer.innerHTML = pokemonHTML;
        })
        .catch(error => {
            console.error('Error al obtener los datos del Pokemon:', error);
        });
});
