<template>
    <div>
        <h2>Lista de Usuarios</h2>
        <ul>
            <li v-for="usuario in usuarios" :key="usuario.id">
                {{ usuario.name }} - Email: {{ usuario.email }}
            </li>
        </ul>
    </div>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Handle</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="usuario in usuarios" :key="usuario.id">
                <th scope="row">{{ usuario.id }}</th>
                <td>{{ usuario.name }}</td>
                <td>{{ usuario.email }}</td>
                <button @click="eliminarUsuario(usuario.id)" class="btn btn-danger">
                    Eliminar
                </button>
            </tr>
        </tbody>
    </table>
    <h2>Agregar Nuevo Usuario</h2>
    <label for="nombre">Nombre:</label>
    <input v-model="nuevoUsuario.name" type="text" id="nombre" required>

    <label for="email">Email:</label>
    <input v-model="nuevoUsuario.email" type="email" id="email" required>

    <button @click="agregarUsuario" class="btn btn-primary">Agregar Usuario</button>
</template>

<script>
export default {
    data() {
        return {
            usuarios: [],
            nuevoUsuario: {
                name:'',
                email:''
            }
        };
    },
    methods: {
        eliminarUsuario(id) {
            this.usuarios = this.usuarios.filter(usuario => usuario.id !== id);
        },

        agregarUsuario() {
            const nuevoId = this.usuarios.length + 1;
            const nuevoUsuario = { id: nuevoId, ...this.nuevoUsuario };
            this.usuarios.push(nuevoUsuario);

            this.nuevoUsuario.name = '';
            this.nuevoUsuario.email = '';
        }
    },
    mounted() {
        fetch('https://jsonplaceholder.typicode.com/users')
            .then(response => response.json())
            .then(data => {
                this.usuarios = data;
            })
            .catch(error => {
                console.error('Error al obtener datos:', error);
            });
    }
}
</script>
  
<style></style>
  