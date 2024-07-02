<template>
  <div class="create-employee">
    <h1>Create Employee</h1>
    <form @submit.prevent="createEmployee" class="employee-form">
      <label for="name">Name:</label>
      <input v-model="employee.name" id="name" required />
      <label for="salary">Salary:</label>
      <input v-model="employee.salary" type="number" id="salary" required />
      <button type="submit">Create</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from "vue";
import EmployeeService from "../services/EmployeeService";
import { useRouter } from "vue-router";

const router = useRouter();
const employee = ref({
  name: "",
  salary: null,
});



const createEmployee = () => {
  EmployeeService.createEmployee(employee.value)
    .then(() => {
      router.push({ name: "EmployeeList" });
    })
    .catch((error) => {
      console.error("Error creating employee:", error);
    });
};
</script>

<style scoped>
.create-employee {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.employee-form {
  display: grid;
  gap: 10px;
}

label {
  font-weight: bold;
}

input {
  padding: 8px;
  border: 1px solid #ddd;
  border-radius: 4px;
}

button {
  padding: 10px;
  background-color: #007bff;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

button:hover {
  background-color: #0056b3;
}
</style>
