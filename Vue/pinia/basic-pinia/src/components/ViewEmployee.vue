<template>
  <div class="view-employee">
    <h2>View Employee</h2>
    <div v-if="selectedEmployee">
      <span v-if="!isEditing" class="employee-name">
        {{ selectedEmployee.name }} - Salary: {{ selectedEmployee.salary }}
      </span>
      <div v-else>
        <input
          class="edit-input"
          v-model="editedName"
          @blur="handleBlur"
          @keydown.enter="handleBlur"
          placeholder="Edit Name"
        />
        <input
          class="edit-input"
          v-model="editedSalary"
          @blur="handleBlur"
          @keydown.enter="handleBlur"
          placeholder="Edit Salary"
        />
      </div>
      <button @click="toggleEdit" class="edit-button">
        {{ isEditing ? "Save" : "Edit" }}
      </button>
    </div>
  </div>
</template>

<script>
import { ref, watch } from "vue";
import { useEmployeeStore } from "../stores/employeeStore";

export default {
  props: {
    id: {
      type: Number,
      required: true,
    },
  },

  setup(props) {
    const employeeStore = useEmployeeStore();
    const { getEmployee } = employeeStore;
    const selectedEmployee = ref(null);
    const editedName = ref("");
    const editedSalary = ref("");
    const isEditing = ref(false);

    watch(
      () => props.id,
      (newId) => {
        selectedEmployee.value = getEmployee(newId);
        editedName.value = selectedEmployee.value
          ? selectedEmployee.value.name
          : "";
        editedSalary.value = selectedEmployee.value
          ? selectedEmployee.value.salary
          : "";
      },
      { immediate: true }
    );

    const toggleEdit = () => {
      isEditing.value = !isEditing.value;
    };

    const handleBlur = () => {
      if (isEditing.value && selectedEmployee.value) {
        employeeStore.updateEmployeeDetails(props.id, {
          name: editedName.value,
          salary: editedSalary.value,
        });
        // toggleEdit();
      }
    };

    return {
      selectedEmployee,
      editedName,
      editedSalary,
      isEditing,
      toggleEdit,
      handleBlur,
    };
  },
};
</script>

<style scoped>
.employee-name {
  font-weight: bold;
}

.edit-input {
  width: 150px;
  margin-right: 10px;
}

.edit-button {
  cursor: pointer;
  margin-left: 10px;
  background-color: #4caf50;
  color: white;
  border: none;
  padding: 5px 10px;
  border-radius: 3px;
}
</style>
