<template>
    <div class="dropdown">
  <button @click="toggleShow()" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    {{caption}}
  </button>
  <ul :class="show?'dropdown-menu show': 'dropdown-menu'">
    <li v-for="item in items"><a @click="itemClicked(item)" class="dropdown-item" href="#">{{item}}</a></li>
  </ul>
</div>
</template>

<script>
export default {
    data() {
        return {
            caption : 'Select Cusines',
            show: false,
            items: ['Japanese', 'Mexican', 'Continental'],
            text: ''
        }
    },
    methods: {
        toggleShow(){
            this.show = !this.show
        },
        itemClicked(item){
            console.log('Clicked on ..', item)
            this.caption = item
            this.show = false
        }
    }

}
</script>