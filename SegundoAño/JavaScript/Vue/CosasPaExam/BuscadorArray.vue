<template>
    <div>
        <input v-model="busqueda" @input="filtrar" placeholder="Buscar...">
        <ul>
            <li v-for="item in resultados" :key="item.id">{{ item.nombre }}</li>
        </ul>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                busqueda: '',
                datos: [
                    { id: 1, nombre: 'Ejemplo 1' },
                    { id: 2, nombre: 'Ejemplo 2' },
                    { id: 3, nombre: 'Ejemplo 3' }
                ],
            };
        },
        computed: {
            resultados() {
                return this.datos.filter(item =>
                    item.nombre.toLowerCase().includes(this.busqueda.toLowerCase())
                );
            },
        },
        methods: {
            // filtrar() {

            // }
        },
    }
</script>