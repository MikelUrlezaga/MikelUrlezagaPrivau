<template>
  <div id="app">
    <HeaderSection />
    <MenuSection />
    <main>
      <!-- Contenido principal de tu página -->
      <h2>Cositas de Html no reutilizable</h2>
      <p>PIPI jeje PEPITO Grillo</p>
      <img alt="Vue logo" src="./assets/logo.png">
      <Contador />
      <FooterSection />
      <ButtonC />
    </main>
  </div>
</template>

<script>

import HeaderSection from './components/HeaderSection.vue';
import FooterSection from './components/FooterSection.vue';
import MenuSection from './components/MenuSection.vue';
import Contador from './components/ContadorComponent.vue';
import ButtonC from './components/ButtonCounter.vue';
import '@/CSS/styles.css';

export default {
  name: 'App',
  components: {
    HeaderSection,
    FooterSection,
    MenuSection,
    Contador,
    ButtonC
  }
}
</script>

<style>
#app {
  /* font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px; */
  
}
</style>
