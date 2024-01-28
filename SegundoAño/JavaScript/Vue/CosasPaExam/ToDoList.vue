<!-- ToDoList.vue -->

<template>
  <div id="aldatu">
    <h2>Lista de Tareas</h2>
    <ul>
      <li v-for="(task, index) in tasks" :key="index">
        {{ task }}
        <button @click="removeTask(index)">Eliminar</button>
      </li>
    </ul>
    <div>
      <input v-model="newTask" placeholder="Nueva tarea" />
      <button @click="addTask">Agregar Tarea</button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tasks: [],
      newTask: "",
    };
  },
  methods: {
    addTask() {
      if (this.newTask.trim() !== "") {
        this.tasks.push(this.newTask.trim());
        this.newTask = "";
      }
    },
    removeTask(index) {
      this.tasks.splice(index, 1);
    },
  },
};
</script>

<style scoped>
/* Estilos específicos del componente, con el modificador "scoped" para evitar colisiones */
ul {
  list-style-type: none;
  padding: 0;
}

li {
  margin-bottom: 5px;
}

button {
  margin-left: 5px;
}

div {
  margin-bottom: 10%;
}

#aldatu{
  margin-top: 5%;
}
</style>
