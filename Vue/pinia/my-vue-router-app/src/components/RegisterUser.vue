<template>
  <div class="register-user">
    <h2>Register User</h2>
    <form @submit.prevent="submitForm">
      <label for="name">Name:</label>
      <input v-model="user.name" id="name" type="text" required />

      <label for="email">Email:</label>
      <input v-model="user.email" id="email" type="email" required />

      <label for="mobileNumber">Mobile Number:</label>
      <input
        v-model="user.mobileNumber"
        id="mobileNumber"
        type="tel"
        required
      />

      <label for="role">Role:</label>
      <select v-model="user.role" id="role" required>
        <option value="admin">Admin</option>
        <option value="user">User</option>
      </select>

      <label for="pwd">Password:</label>
      <input v-model="user.pwd" id="pwd" type="password" required />

      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useAuthStore } from "../store/authStore";

const { registerUser } = useAuthStore();
const user = ref({
  name: "",
  email: "",
  mobileNumber: "",
  role: "admin",
  pwd: "",
});

const submitForm = async () => {
  try {
    console.log("Register called");
    await registerUser(user.value);
  } catch (error) {
    console.error("Error registering user:", error);
  }
};
</script>

<style scoped>
.register-user {
  margin-top: 20px;
}

form {
  display: grid;
  gap: 10px;
}
</style>
