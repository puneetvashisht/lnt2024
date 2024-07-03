import { mount } from "@vue/test-utils";
import EmployeeDetails from "../src/components/EmployeeDetails.vue";

describe("EmployeeDetails", () => {
  it("renders employee details correctly", async () => {
    const wrapper = mount(EmployeeDetails, {
      props: {
        employee: {
          id: 1,
          name: "John Doe",
          salary: 50000,
        },
      },
    });

    expect(wrapper.find("h1").text()).toBe("Employee Details");
    expect(wrapper.find(".details p:nth-child(1)").text()).toBe("ID: 1");
    expect(wrapper.find(".details p:nth-child(2)").text()).toBe(
      "Name: John Doe"
    );
    expect(wrapper.find(".details p:nth-child(3)").text()).toBe(
      "Salary: 50000"
    );
  });

  it("calls loadEmployee method on mount", async () => {
    const loadEmployeeMock = jest.fn();
    const $route = {
      params: { id: 1 },
    };

    mount(EmployeeDetails, {
      global: {
        mocks: {
          $route,
        },
      },
      methods: {
        loadEmployee: loadEmployeeMock,
      },
    });

    expect(loadEmployeeMock).toHaveBeenCalled();
  });
});
