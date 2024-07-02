<template>
  <div>
    <h1 class="list-heading">Employee List</h1>
    <ul class="employee-list">
      <li
        v-for="employee in employees"
        :key="employee.id"
        class="employee-item"
      >
        <router-link
          :to="{ name: 'EmployeeDetails', params: { id: employee.id } }"
          class="employee-link"
          >{{ employee.name }}</router-link
        >
        <button @click="deleteEmployee(employee.id)" class="delete-button">
          <i class="fas fa-trash-alt"></i>
        </button>
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import EmployeeService from "../services/EmployeeService";

const employees = ref([]);


const loadEmployees = () => {
  EmployeeService.getEmployees()
    .then((response) => {
      employees.value = response.data;
    })
    .catch((error) => {
      console.error("Error fetching employees:", error);
    });
};

const deleteEmployee = (employeeId) => {
  EmployeeService.deleteEmployee(employeeId)
    .then(() => {
      loadEmployees();
    })
    .catch((error) => {
      console.error("Error deleting employee:", error);
    });
};

onMounted(() => {
  loadEmployees();
});
</script>

<!-- Remove scoped to display style scoping -->

<style scoped>
h1 {
  font-size: 24px;
  color: #707070;
  margin-bottom: 20px;
}

.employee-list {
  list-style-type: none;
  padding: 0;
}

.employee-item {
  margin-bottom: 10px;
}

.employee-link {
  text-decoration: none;
  color: #007bff;
  font-weight: bold;
  cursor: pointer;
  transition: color 0.3s ease;
}

.employee-link:hover {
  color: #0056b3;
}
.delete-button {
  margin-left: 10px;
  color: #ff5757;
  border: none;
  padding: 5px 10px;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.delete-button:hover {
  background-color: #c82333;
}
</style>
