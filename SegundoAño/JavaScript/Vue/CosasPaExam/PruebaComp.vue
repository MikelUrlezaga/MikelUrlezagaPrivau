<template>
    <div>
      <h2>Lista de Usuarios</h2>
      <ul>
        <li v-for="usuario in usuarios" :key="usuario.id">
          {{ usuario.nombre }} - Edad: {{ usuario.edad }}
        </li>
      </ul>
    </div>
  </template>
  
  <script>
  import datos from '@/Json/datos.json';
  
  export default {
    data() {
      return {
        usuarios: datos.usuarios
      };
    }
  }
  </script>
  
  <style>
  /* Estilos específicos del componente, si es necesario */
  </style>
  