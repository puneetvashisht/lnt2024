<template>
  <button @click="incrementCount" type="button" class="btn btn-primary">
    Votes <span class="badge text-bg-secondary">{{ count }}</span>
  </button>
</template>

<script>
export default {
  data: function () {
    return { count: 0 };
  },
  methods: {
    incrementCount() {
      this.count++;
    },
  },
};
</script>
