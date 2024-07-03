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
import { ref, onMounted } from "vue";
import { useRoute, useRouter } from "vue-router";
import { useEmployeeStore } from "../store/employeeStore";

const { getEmployee, updateEmployeeDetails } = useEmployeeStore();

const router = useRouter();
const employee = ref({});
const id = useRoute().params.id;
const loadEmployee = async () => {
  const data = await getEmployee(id);
  console.log("emp+--+", data);
  employee.value = data;
};
console.log("EMPLOYEE-+-+--+-+", employee.value);
const updateEmployee = async () => {
  const data = await updateEmployeeDetails(id, employee.value);
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
