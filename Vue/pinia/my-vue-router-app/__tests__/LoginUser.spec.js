import { mount } from "@vue/test-utils";
import LoginUser from "../src/components/LoginUser.vue";

describe("LoginUser", () => {
  it("renders login form correctly", async () => {
    const wrapper = mount(LoginUser);

    expect(wrapper.find(".q-mb-md h2").text()).toBe("Login User");
    expect(wrapper.find("form").exists()).toBe(true);
    expect(wrapper.find('label[for="username"]').exists()).toBe(true);
    expect(wrapper.find("input#username").exists()).toBe(true);
    expect(wrapper.find('label[for="pwd"]').exists()).toBe(true);
    expect(wrapper.find("input#pwd").exists()).toBe(true);
    expect(wrapper.find('button[type="submit"]').exists()).toBe(true);
  });

  it("calls submitForm method when form is submitted", async () => {
    const wrapper = mount(LoginUser);
    const submitFormMock = jest.fn();

    wrapper.vm.submitForm = submitFormMock;
    await wrapper.find("form").trigger("submit.prevent");

    expect(submitFormMock).toHaveBeenCalled();
  });
});
