<template>
    <footer>

      <div class="card" style="width: 18rem;">
        <img src="../../Imagenes/Home-removebg-preview.png" class="card-img-top" alt="">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
      </div>
    </footer>
  </template>
  
  <script>
  export default {
    name: 'FooterSection',
    data() {
      return {
        message: '¡Gracias por visitar nuestra página Vue!',
      };
    },
  };
  </script>
  
  <style scoped>
  /* Estilos específicos para el componente FooterSection */
  </style>
  