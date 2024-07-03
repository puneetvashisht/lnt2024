<template>
  <div id="app">
    <q-layout>
      <q-header elevated>
        <q-toolbar>
          <q-toolbar-title>
            <router-link to="/" class="text-white">Employee List</router-link>
          </q-toolbar-title>
          <q-tabs v-if="isLoggedIn" v-model="activeTab" class="text-white">
            <!-- <q-tab class="text-white">
              <router-link to="/" class="text-white">
                Employee List
              </router-link></q-tab
            > -->
            <q-tab class="text-white">
              <router-link to="/create" class="text-white">
                Create Employee
              </router-link></q-tab
            >
          </q-tabs>

          <q-space v-else />

          <q-btn
            v-if="isLoggedIn"
            @click="logout"
            class="text-white"
            label="Logout"
            color="primary"
          />
          <router-link v-else to="/login" class="text-white">
            Login
          </router-link>
        </q-toolbar>
      </q-header>
      <q-page-container class="full-width">
        <router-view></router-view>
      </q-page-container>
    </q-layout>
  </div>
</template>

<script setup>
import { ref, watch } from "vue";
import { useAuthStore } from "./store/authStore";
import { storeToRefs } from "pinia";
const { isLoggedIn } = storeToRefs(useAuthStore());
const { logout } = useAuthStore();

console.log("USER---++-+-+-+--+-+-+-+", isLoggedIn.value);

const activeTab = ref("");

watch(() => {
  activeTab.value = "";
});
</script>

<style>
h1 {
  color: bisque;
}
.full-width {
  margin-top: 100px;
}
</style>
