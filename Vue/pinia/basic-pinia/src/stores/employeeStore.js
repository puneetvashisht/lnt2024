import { defineStore } from "pinia";
import { ref } from "vue";

export const useEmployeeStore = defineStore("employee", () => {
  // state (only state for employees)
  const employees = ref([]);


  // actions for function to change state..
  function createEmployee(employee) {
    console.log(employees.value);
    employees.value.push(employee);
  }

  function getEmployee(id) {
    return employees.value.find((employee) => employee.id === id);
  }

  function updateEmployeeDetails(id, updatedDetails) {
    const employeeIndex = employees.value.findIndex(
      (employee) => employee.id === id
    );

    if (employeeIndex !== -1) {
      Object.assign(employees.value[employeeIndex], updatedDetails);
    }
  }

  return { employees, createEmployee, getEmployee, updateEmployeeDetails };
});
