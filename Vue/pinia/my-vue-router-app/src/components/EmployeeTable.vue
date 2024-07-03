<template>
    <h2>Table of Employees</h2>
    <table border="1">
        <tr v-for="employee in employees">
            <td>{{employee.name}}</td>
        </tr>
    </table>
</template>
<script setup>

import { ref } from "vue";
import { useEmployeeStore } from "../store/employeeStore";
import { storeToRefs } from "pinia";
const { employees } = storeToRefs(useEmployeeStore());



</script>