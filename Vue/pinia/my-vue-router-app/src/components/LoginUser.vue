<template>
  <div class="login-user">
    <q-page class="q-pa-md">
      <h2 class="q-mb-md text-h6">Login User</h2>
      <q-card class="q-mb-md">
        <q-img src="https://cdn.quasar.dev/img/parallax2.jpg"> </q-img>
        <q-card-section class="q-pa-md">
          <q-form @submit.prevent="submitForm">
            <q-input
              v-model="credentials.username"
              label="Email"
              type="email"
              outlined
              class="q-mb-md"
            />
            <q-input
              v-model="credentials.pwd"
              label="Password"
              type="password"
              outlined
              class="q-mb-md"
            />

            <q-btn
              type="submit"
              color="primary"
              label="Login"
              class="q-mr-md"
            />
            <q-btn
              type="button"
              color="secondary"
              @click="register"
              label="Register"
            />
          </q-form>
        </q-card-section>
      </q-card>
    </q-page>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useAuthStore } from "../store/authStore";
import { useRouter } from "vue-router";

const router = useRouter();
const { loginUser } = useAuthStore();
const credentials = ref({
  username: "",
  pwd: "",
});
const register = () => {
  router.push({ path: "/register" });
};

const submitForm = async () => {
  try {
    await loginUser(credentials.value);
  } catch (error) {
    console.error("Error logging in:", error);
  }
};
</script>

<style>
/* Add your custom styles here */
.login-user {
  width: 600px;
  margin: 0 auto;
}
</style>
