<template>
  <div class="dropdown">
    <button
      @click="toggleShow"
      class="btn btn-secondary dropdown-toggle"
      type="button"
      data-bs-toggle="dropdown"
      aria-expanded="false"
    >
      Dropdown button
    </button>
    <ul :class="show ? 'dropdown-menu show' : 'dropdown-menu'">
      <!-- <li v-for="course in courses" :key="course">{{ course }}</li> -->
      <DropdownItem
        v-for="course in courses"
        :key="course"
        :itemText="course"
      ></DropdownItem>
    </ul>
  </div>
</template>
<script>
import DropdownItem from "./DropdownItem.vue";
export default {
  components: {
    DropdownItem,
  },
  methods: {
    toggleShow() {
      this.show = !this.show;
    },
  },
  data() {
    return {
      show: false,
      courses: ["VueJs", "Angular", "React"],
    };
  },
};
</script>
