<template>
    <div>
        <h2 v-if="show">Test component</h2>
        <input v-model="text"> {{ text }}
        <button  class="btn btn-danger" @click="toggleShow()">Toggle</button>
        <ol>
            <li v-for="item in items">{{ item }}</li>
        </ol>
        <p>{{ itemSize }}</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            show: true,
            items: ['Item1', 'Item2', 'Item3'],
            text: ''
        }
    },
    methods: {
        toggleShow(){
            this.show = !this.show
        }
    },
    computed: {
        itemSize() {
            return this.items.length > 10 ? 'Big List' : 'Small List'
        }
    }

}
</script>