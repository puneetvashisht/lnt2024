import { defineStore } from "pinia";
import { register, login } from "../services/authService";
import { ref } from "vue";
import { useRouter } from "vue-router";

export const useAuthStore = defineStore("auth", () => {
  const router = useRouter();
  const isLoggedIn = ref(true);
  const user = ref({ name: "test", id: 1, token: "token string" });
  // const user = ref(null);
  const token = ref(null);

  async function registerUser(user) {
    console.log("Register Called with User-+-+-+-+-+-+-+-+");
    try {
      const data = await register(user);
      console.log("Register data--++--+", data);
      if (data.status === 201) {
        router.push("/login");
      }
      // user.value = data.user;
      // token.value = data.token;
    } catch (error) {
      console.error("Error registering user:", error);
      throw error;
    }
  }
  async function loginUser(credentials) {
    try {
      const data = await login(credentials);
      console.log(
        "Login data-+-+-+-+--+-+",
        data.headers,
        data.headers.get("Authorization")
      );
      if (data.headers.get("Authorization")) {
        localStorage.setItem("token", data.headers.get("Authorization"));
        isLoggedIn.value = true;
        router.push({ name: "EmployeeList" });
      }

      // user.value = data.user;
      // token.value = data.token;
    } catch (error) {
      console.error("Error logging in:", error);
      throw error;
    }
  }

  const logout = () => {
    console.log("Logging Out-+---+-+");
    user.value = null;
    token.value = null;
    isLoggedIn.value = false;
    router.push("/");
  };

  return { user, token, isLoggedIn, registerUser, loginUser, logout };
});
