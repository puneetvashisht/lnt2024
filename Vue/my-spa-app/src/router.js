import { createMemoryHistory, createRouter } from 'vue-router'

import Home from './Home.vue'
import About from './About.vue'
import ViewCourses from './components/ViewCourses.vue'
import ViewCourse from './components/ViewCourse.vue'
import AddCourse from './components/AddCourse.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/about', component: About },
  { path: '/viewcourses', component: ViewCourses},
  { path: '/addcourse', component: AddCourse},
  {path: '/course/:id', name:'course', component: ViewCourse}
]

const router = createRouter({
  history: createMemoryHistory(),
  routes,
})

export default router