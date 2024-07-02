<template>
  <div id="app">
    <h1>Employee Management</h1>
    <nav>
      <router-link to="/">EmployeeList</router-link> |
      <router-link to="/create">CreateEmployee</router-link>
    </nav>

    <router-view></router-view>
  </div>
</template>

<script setup></script>

<style>
h1 {
  color: bisque;
}
</style>
