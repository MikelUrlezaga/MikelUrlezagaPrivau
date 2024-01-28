<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  <PruebaComp />
  <FetchPokemon />
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import PruebaComp from './components/PruebaComp.vue'
import FetchPokemon from './components/FetchPokemon.vue'
import '@/CSS/style.css'

export default {
  name: 'App',
  components: {
    // HelloWorld
    PruebaComp,
    FetchPokemon
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #2c3e50;
  margin-top: 60px;
}
</style>
