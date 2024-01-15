<template>
    <div>
      <p>{{ message }}</p>
      <div class="menu-container">
            <div class="menu">
                <ul class="menu-items">
                <li><a href="#"><img class="Icono" src="../../Imagenes/Home-removebg-preview.png"></a><span class="menu-text"><b>Home</b></span></li>
                </ul>
            </div>
        </div>
      </div>
  </template>
  
  <script>
  export default {
    name: 'MenuSection',
    data() {
      return {
        message: '¡Gracias por visitar nuestra página Vue!',
      };
    },
  };
  </script>
  
  <style scoped>

  </style>
  