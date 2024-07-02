import { createRouter, createWebHistory } from "vue-router";
import EmployeeList from "../components/EmployeeList.vue";
import EmployeeDetails from "../components/EmployeeDetails.vue";
import CreateEmployee from "../components/CreateEmployee.vue";
import UpdateEmployee from "../components/UpdateEmployee.vue";

const routes = [
  { path: "/", name: "EmployeeList", component: EmployeeList },
  {
    path: "/employees/:id",
    name: "EmployeeDetails",
    component: EmployeeDetails,
  },
  { path: "/create", name: "CreateEmployee", component: CreateEmployee },
  { path: "/update/:id", name: "UpdateEmployee", component: UpdateEmployee },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
