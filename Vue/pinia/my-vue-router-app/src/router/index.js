import { createRouter, createWebHistory } from "vue-router";
import EmployeeList from "../components/EmployeeList.vue";
import EmployeeDetails from "../components/EmployeeDetails.vue";
import CreateEmployee from "../components/CreateEmployee.vue";
import UpdateEmployee from "../components/UpdateEmployee.vue";
import RegisterUser from "../components/RegisterUser.vue";
import LoginUser from "../components/LoginUser.vue";
import { useAuthStore } from "../store/authStore";

const routes = [
  { path: "/", name: "EmployeeList", component: EmployeeList },
  {
    path: "/employees/:id",
    name: "EmployeeDetails",
    component: EmployeeDetails,
  },
  { path: "/register", name: "Register", component: RegisterUser },
  { path: "/login", name: "Login", component: LoginUser },
  {
    path: "/create",
    name: "CreateEmployee",
    component: CreateEmployee,
    meta: { requiresAuth: true },
  },
  {
    path: "/update/:id",
    name: "UpdateEmployee",
    component: UpdateEmployee,
    meta: { requiresAuth: true },
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

router.beforeEach((to, from, next) => {
  const store = useAuthStore();
  if (to.meta.requiresAuth && !store.isLoggedIn) {
    next("/login");
  } else {
    next();
  }
});

export default router;
