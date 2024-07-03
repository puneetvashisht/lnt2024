import { mount } from "@vue/test-utils";
import RegisterUser from "../src/components/RegisterUser.vue";

describe("RegisterUser", () => {
  it("renders registration form correctly", async () => {
    const wrapper = mount(RegisterUser);

    expect(wrapper.find("h2").text()).toBe("Register User");
    expect(wrapper.find("form").exists()).toBe(true);
    expect(wrapper.find('label[for="name"]').exists()).toBe(true);
    expect(wrapper.find("input#name").exists()).toBe(true);
    expect(wrapper.find('label[for="email"]').exists()).toBe(true);
    expect(wrapper.find("input#email").exists()).toBe(true);
    expect(wrapper.find('label[for="mobileNumber"]').exists()).toBe(true);
    expect(wrapper.find("input#mobileNumber").exists()).toBe(true);
    expect(wrapper.find('label[for="role"]').exists()).toBe(true);
    expect(wrapper.find("select#role").exists()).toBe(true);
    expect(wrapper.find('label[for="pwd"]').exists()).toBe(true);
    expect(wrapper.find("input#pwd").exists()).toBe(true);
    expect(wrapper.find('button[type="submit"]').exists()).toBe(true);
  });

  it("calls submitForm method when form is submitted", async () => {
    const wrapper = mount(RegisterUser);
    const submitFormMock = jest.fn();

    wrapper.vm.submitForm = submitFormMock;
    await wrapper.find("form").trigger("submit.prevent");

    expect(submitFormMock).toHaveBeenCalled();
  });
});
