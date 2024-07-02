<template>
  <div class="employee-details">
    <h1>Employee Details</h1>
    <div class="details">
      <p><strong>ID:</strong> {{ employee.id }}</p>
      <p><strong>Name:</strong> {{ employee.name }}</p>
      <p><strong>Salary:</strong> {{ employee.salary }}</p>
    </div>
    <router-link
      :to="{ name: 'UpdateEmployee', params: { id: employee.id } }"
      class="update-button"
    >
      Update Employee
    </router-link>
  </div>
</template>

<script setup>
import EmployeeService from "../services/EmployeeService";
import { ref, onMounted } from "vue";
import { useRoute } from "vue-router";

const employee = ref({});

const loadEmployee = () => {
  const id = useRoute().params.id;
  EmployeeService.getEmployee(id)
    .then((response) => {
      employee.value = response.data;
    })
    .catch((error) => {
      console.error("Error fetching employee details:", error);
    });
};

onMounted(() => {
  loadEmployee();
});
</script>

<style scoped>
.employee-details {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.details {
  margin-top: 20px;
}

.details p {
  margin-bottom: 10px;
}

.details strong {
  margin-right: 10px;
  font-weight: bold;
}

.update-button {
  display: inline-block;
  margin-top: 10px;
  padding: 8px 12px;
  background-color: #007bff;
  color: #fff;
  text-decoration: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
