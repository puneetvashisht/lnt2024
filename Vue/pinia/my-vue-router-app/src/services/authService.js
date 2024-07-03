import http from "../utils/http-common";

export const register = (user) => {
  return http.post(`/register`, user);
};

export const login = (credentials) => {
  console.log("Credentials", credentials.username, credentials.pwd);
  return http.post(
    `/user`,
    {},
    { auth: { username: credentials.username, password: credentials.pwd } }
  );
  // .then((res) => {
  //   //   router.push({ name: "EmployeeList" });
  //   console.log(res.headers.getAuthorization());
  //   localStorage.setItem("token", res.headers.getAuthorization());
  //   return res.headers.getAuthorization();
  // });
};
