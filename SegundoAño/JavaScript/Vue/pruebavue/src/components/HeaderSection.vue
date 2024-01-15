<template>
    <header>
      <h1>{{ title }}</h1>
    </header>
  </template>
  
  <script>
  export default {
    name: 'HeaderSection',
    data() {
      return {
        title: 'Mi Página Vue con Componentes',
      };
    },
  };
  </script>
  
  <style scoped>
  /* Estilos específicos para el componente HeaderSection */
  </style>
  