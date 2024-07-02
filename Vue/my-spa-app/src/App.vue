
<template>
  <!-- <h1>Hello App!</h1>
  <p>
    <strong>Current route path:</strong> {{ $route.fullPath }}
  </p> -->
  <Header></Header>
  <!-- <nav>
    <RouterLink to="/">Go to Home</RouterLink> |
    <RouterLink to="/about">Go to About</RouterLink> |
    <RouterLink to="/viewcourses">View Course</RouterLink> |
    <RouterLink to="/addcourse">Add Course</RouterLink>

  </nav> -->
  <main>
    <RouterView />
  </main>
</template>

<script>
import Header from './components/Header.vue';
export default {
  components : {
    Header
  }
}
</script>