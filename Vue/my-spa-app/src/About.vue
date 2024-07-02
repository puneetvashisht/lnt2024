<script setup>
import Card from './components/Card.vue';
import { computed } from 'vue'
import { useRoute, useRouter } from 'vue-router'


const router = useRouter()
const route = useRoute()

const search = computed({
  get() {
    return route.query.search ?? ''
  },
  set(search) {
    router.replace({ query: { search } })
  }
})
</script>

<template>
  <h2>AboutView</h2>
  <label>
    Search: <input v-model.trim="search" maxlength="20">
  </label>
  <Card title="Angular"></Card>
  <Card title="React"></Card>
  <Card title="Vue"></Card>
</template>