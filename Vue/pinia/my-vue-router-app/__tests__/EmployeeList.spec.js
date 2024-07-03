import { mount } from "@vue/test-utils";
import EmployeeList from "../src/components/EmployeeList.vue";

describe("EmployeeList", () => {
  it("renders employee list correctly", async () => {
    const employees = [
      { id: 1, name: "John Doe" },
      { id: 2, name: "Jane Doe" },
    ];
    const wrapper = mount(EmployeeList, {
      global: {
        provide: {
          useEmployeeStore: {
            employees,
            fetchEmployees: jest.fn(),
            deleteEmployee: jest.fn(),
          },
        },
      },
    });

    expect(wrapper.find(".list-heading").text()).toBe("Employee List");
    expect(wrapper.findAll(".employee-item")).toHaveLength(2);
  });

  it("calls loadEmployees method on mount", async () => {
    const loadEmployeesMock = jest.fn();

    mount(EmployeeList, {
      global: {
        provide: {
          useEmployeeStore: {
            employees: [],
            fetchEmployees: loadEmployeesMock,
            deleteEmployee: jest.fn(),
          },
        },
      },
    });

    expect(loadEmployeesMock).toHaveBeenCalled();
  });
});
