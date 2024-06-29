<template>
  <button @click="incrementCount" type="button" class="btn btn-primary">
    Notifications <span class="badge text-bg-secondary">{{ count }}</span>
  </button>
</template>

<script>
export default {
  data: function () {
    return { count: 2 };
  },
  methods: {
    incrementCount() {
      this.count++;
    },
  },
};
</script>
