<template>
  <div class="create-employee">
    <h2>Create Employee</h2>
    <form>
      <label for="name">Name:</label>
      <input v-model="newEmployee.name" id="name" type="text" required />

      <label for="salary">Salary:</label>
      <input v-model="newEmployee.salary" id="salary" type="number" required />

      <button type="button" @click="createNewEmployee">Create Employee</button>
    </form>
  </div>
</template>

<script>
import { ref } from "vue";
import { useEmployeeStore } from "../stores/employeeStore";

export default {
  setup() {
    const { createEmployee } = useEmployeeStore();
    //  = employeeStore;
    const newEmployee = ref({
      name: "",
      salary: 0,
    });

    const createNewEmployee = () => {
      console.log("Creating new employee:");
      console.log("Form submitted:", newEmployee.value);
      if (newEmployee.value.name && newEmployee.value.salary) {
        createEmployee({
          id: Date.now(),
          name: newEmployee.value.name,
          salary: newEmployee.value.salary
        });

        newEmployee.value = {
          name: "",
          salary: 0,
        };
      }
      //   else {
      //     alert("Please provide both name and salary.");
      //   }
    };

    return { newEmployee, createNewEmployee };
  },
};
</script>

<style scoped>
.create-employee {
  margin-top: 20px;
}

form {
  display: grid;
  gap: 10px;
}
</style>
