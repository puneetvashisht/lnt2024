import { createMemoryHistory, createRouter } from 'vue-router'

import Home from './Home.vue'
import About from './About.vue'
import ViewCourses from './components/ViewCourses.vue'
import AddCourse from './components/AddCourse.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/about', component: About },
  { path: '/viewcourses', component: ViewCourses},
  { path: '/addcourse', component: AddCourse},
]

const router = createRouter({
  history: createMemoryHistory(),
  routes,
})

export default router