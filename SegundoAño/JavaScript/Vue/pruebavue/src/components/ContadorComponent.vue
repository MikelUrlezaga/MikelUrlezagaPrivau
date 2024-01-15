<!-- Cambiado el nombre del componente a "CounterComponent" -->
<template>
    <div>
      <p>Contador: {{ count }}</p>
      <button @click="increment">Incrementar</button>
      <button @click="decrement">Decrementar</button>
      <button @click="aZero">A Cero</button>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        count: 0
      };
    },
    methods: {
      increment() {
        this.count++;
      },
      decrement() {
        this.count--;
      },
      aZero() {
        this.count = 0;
      }
    }
  };
  </script>
  