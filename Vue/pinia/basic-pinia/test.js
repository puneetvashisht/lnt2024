// const defineStore = require('pinia')
import {defineStore} from 'pinia'
export const useCounterStore = defineStore('counter', {
    state: () => ({ count: 0, name: 'Eduardo' }),
    getters: {
      doubleCount: (state) => state.count * 2,
    },
    actions: {
      increment() {
        this.count++
      },
    }
    // return {count, increment }
  })

  const store = useCounterStore()

  store.increment();
  console.log(  store.count);
