<script setup>
import ViewEmployee from "./components/ViewEmployee.vue";
import ListEmployee from "./components/ListEmployee.vue";
import { ref } from "vue";
import CreateEmployee from "./components/CreateEmployee.vue";
components: {
  ListEmployee, ViewEmployee, CreateEmployee;
}
const selectedEmployeeId = ref(null);
function handleSelectEmployee(employeeId) {
  selectedEmployeeId.value = employeeId;
}
</script>

<template>
  <div>
    <create-employee></create-employee>
    <list-employee @employeeSelected="handleSelectEmployee"></list-employee>
    <view-employee
      v-if="selectedEmployeeId"
      :id="selectedEmployeeId"
    ></view-employee>
  </div>
</template>

<style scoped></style>
