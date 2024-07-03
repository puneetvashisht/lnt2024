import { defineStore } from "pinia";
import { ref } from "vue";
import EmployeeService from "../services/EmployeeService";
import { useRouter } from "vue-router";

export const useEmployeeStore = defineStore("employee", () => {
  const router = useRouter();
  const employees = ref([]);

  async function createEmployee(employee) {
    console.log("create called-+-+--+-");
    const response = await EmployeeService.createEmployee(employee);
    console.log("create employee-+-+--+-", response);
    if (response.status === 201) {
      router.push("/");
    }
  }

  async function fetchEmployees() {
    const response = await EmployeeService.getEmployees();
    console.log("employees-+-+-+", response);
    employees.value = response.data;
  }
  async function getEmployee(id) {
    const response = await EmployeeService.getEmployee(id);
    console.log("Get Employee-+++-+-+--", response);
    if (response.status === 200) {
      return response.data;
    }
  }

  async function updateEmployeeDetails(id, updatedDetails) {
    const response = await EmployeeService.updateEmployee(id, updatedDetails);
    console.log("update response+--+-+-+", response);
    if (response.status === 200) {
      router.push("/");
    }
  }
  async function deleteEmployee(id) {
    const response = await EmployeeService.deleteEmployee(id);
    console.log("update response+--+-+-+", response);
    if (response.status === 200) {
      fetchEmployees();
    }
  }

  return {
    employees,
    fetchEmployees,
    createEmployee,
    getEmployee,
    deleteEmployee,
    updateEmployeeDetails,
  };
});

// import { defineStore } from "pinia";
// import { ref } from "vue";

// export const useEmployeeStore = defineStore("employee", () => {
//   const employees = ref([]);

//   async function fetchEmployees() {
//     try {
//       const response = await fetch("https://your-api-url/employees");
//       const data = await response.json();
//       employees.value = data;
//     } catch (error) {
//       console.error("Error fetching employees:", error);
//     }
//   }

//   async function createEmployee(employee) {
//     try {
//       const response = await fetch("https://your-api-url/employees", {
//         method: "POST",
//         headers: {
//           "Content-Type": "application/json",
//         },
//         body: JSON.stringify(employee),
//       });
//       const data = await response.json();
//       employees.value.push(data);
//     } catch (error) {
//       console.error("Error creating employee:", error);
//     }
//   }

//   async function getEmployee(id) {
//     try {
//       const response = await fetch(`https://your-api-url/employees/${id}`);
//       const data = await response.json();
//       return data;
//     } catch (error) {
//       console.error("Error getting employee:", error);
//     }
//   }

//   async function updateEmployeeDetails(id, updatedDetails) {
//     try {
//       const response = await fetch(`https://your-api-url/employees/${id}`, {
//         method: "PUT",
//         headers: {
//           "Content-Type": "application/json",
//         },
//         body: JSON.stringify(updatedDetails),
//       });

//       if (response.ok) {
//         const updatedEmployee = await response.json();
//         const index = employees.value.findIndex(
//           (employee) => employee.id === id
//         );
//         if (index !== -1) {
//           employees.value.splice(index, 1, updatedEmployee);
//         }
//       } else {
//         console.error("Failed to update employee details");
//       }
//     } catch (error) {
//       console.error("Error updating employee details:", error);
//     }
//   }

//   return {
//     employees,
//     fetchEmployees,
//     createEmployee,
//     getEmployee,
//     updateEmployeeDetails,
//   };
// });
