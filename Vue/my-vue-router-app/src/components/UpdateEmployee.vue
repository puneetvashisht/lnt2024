<template>
  <div class="update-employee">
    <h1>Update Employee</h1>
    <form @submit.prevent="updateEmployee" class="employee-form">
      <label for="name">Name:</label>
      <input v-model="employee.name" id="name" required />
      <label for="salary">Salary:</label>
      <input v-model="employee.salary" type="number" id="salary" required />
      <button type="submit">Update</button>
    </form>
  </div>
</template>

<script setup>
import EmployeeService from "../services/EmployeeService";
import { ref, onMounted } from "vue";
import { useRoute, useRouter } from "vue-router";

const router = useRouter();
const employee = ref({});
const id = useRoute().params.id;
const loadEmployee = () => {
  EmployeeService.getEmployee(id)
    .then((response) => {
      employee.value = response.data;
    })
    .catch((error) => {
      console.error("Error fetching employee details for update:", error);
    });
};

const updateEmployee = () => {
  EmployeeService.updateEmployee(id, employee.value)
    .then(() => {
      router.push({ name: "EmployeeList" });
    })
    .catch((error) => {
      console.error("Error updating employee:", error);
    });
};

onMounted(() => {
  loadEmployee();
});
</script>

<style scoped>
.update-employee {
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
  background-color: #28a745;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

button:hover {
  background-color: #218838;
}
</style>
