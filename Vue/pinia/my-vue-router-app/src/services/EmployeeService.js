import http from "../utils/http-common";

export default {
  getEmployees() {
    return http.get(`/employees`);
  },
  getEmployee(id) {
    return http.get(`/employees/${id}`);
  },
  createEmployee(employee) {
    return http.post(`/employees`, employee);
  },
  updateEmployee(id, employee) {
    return http.put(`/employees/${id}`, employee);
  },
  deleteEmployee(id) {
    return http.delete(`/employees/${id}`);
  },
};
