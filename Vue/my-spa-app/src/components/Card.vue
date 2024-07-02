<template>
<div class="card" style="width: 18rem;">
  <img src="https://picsum.photos/200" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">{{title}}</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
     <Badge></Badge>
  </div>
</div>
</template>
<script setup>
import Badge from './Badge.vue';

  

const props = defineProps(['title'])
</script>