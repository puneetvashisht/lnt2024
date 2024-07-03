import { mount } from "@vue/test-utils";
import UpdateEmployee from "../src/components/UpdateEmployee.vue";

describe("UpdateEmployee", () => {
  it("renders update form correctly", async () => {
    const wrapper = mount(UpdateEmployee);

    expect(wrapper.find("h1").text()).toBe("Update Employee");
    expect(wrapper.find("form").exists()).toBe(true);
    expect(wrapper.find('label[for="name"]').exists()).toBe(true);
    expect(wrapper.find("input#name").exists()).toBe(true);
    expect(wrapper.find('label[for="salary"]').exists()).toBe(true);
    expect(wrapper.find("input#salary").exists()).toBe(true);
    expect(wrapper.find('button[type="submit"]').exists()).toBe(true);
  });

  it("calls updateEmployee method when form is submitted", async () => {
    const wrapper = mount(UpdateEmployee);
    const updateEmployeeMock = jest.fn();

    wrapper.vm.updateEmployee = updateEmployeeMock;
    await wrapper.find("form").trigger("submit.prevent");

    expect(updateEmployeeMock).toHaveBeenCalled();
  });
});
