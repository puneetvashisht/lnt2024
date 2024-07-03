// tests/CreateEmployee.test.js
import { mount } from "vitest";
import CreateEmployee from "../src/CreateEmployee.vue";

// Mock the router and store dependencies
// const mockRouter = {
//   push: jest.fn(),
// };

// const mockStore = {
//   createEmployee: jest.fn(),
// };

test("renders create employee form correctly", async () => {
  const wrapper = mount(CreateEmployee);

  // Check if the component renders the form elements
  expect(wrapper.html()).toContain("<h1>Create Employee</h1>");
  expect(wrapper.html()).toContain("<form");
  expect(wrapper.html()).toContain('<label for="name">Name:</label>');
  expect(wrapper.html()).toContain('<input v-model="employee.name"');
  expect(wrapper.html()).toContain('<label for="salary">Salary:</label>');
  expect(wrapper.html()).toContain(
    '<input v-model="employee.salary" type="number"'
  );
  expect(wrapper.html()).toContain('<button type="submit">Create</button>');
});

// test("creates employee when form is submitted", async () => {
//   const wrapper = mount(CreateEmployee, {
//     globals: {
//       $router: mockRouter,
//       $store: mockStore,
//     },
//   });

//   // Simulate user input
//   await wrapper.setData({ employee: { name: "John Doe", salary: 50000 } });

//   // Trigger form submission
//   await wrapper.trigger("form", "submit.prevent");

//   // Check if the createEmployee method is called with the correct parameters
//   expect(mockStore.createEmployee).toHaveBeenCalledWith({
//     name: "John Doe",
//     salary: 50000,
//   });

//   // Check if the router.push method is called
//   expect(mockRouter.push).toHaveBeenCalledWith("/"); // Assuming you navigate to the home page after creating an employee
// });

// import { mount } from "@vue/test-utils";
// import CreateEmployee from "../src/components/CreateEmployee.vue";

// describe("CreateEmployee", () => {
//   it("renders form elements correctly", () => {
//     const wrapper = mount(CreateEmployee);

//     expect(wrapper.find("form").exists()).toBe(true);
//     expect(wrapper.find('label[for="name"]').exists()).toBe(true);
//     expect(wrapper.find("input#name").exists()).toBe(true);
//     expect(wrapper.find('label[for="salary"]').exists()).toBe(true);
//     expect(wrapper.find("input#salary").exists()).toBe(true);
//     expect(wrapper.find('button[type="submit"]').exists()).toBe(true);
//   });

//   it("calls createEmp method when form is submitted", async () => {
//     const wrapper = mount(CreateEmployee);
//     const createEmpMock = jest.fn();

//     wrapper.vm.createEmp = createEmpMock;
//     await wrapper.find("form").trigger("submit.prevent");

//     expect(createEmpMock).toHaveBeenCalled();
//   });
// });
