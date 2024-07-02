import axios from "axios";

const API_BASE_URL = "http://localhost:3000";

export default {
  getCourses() {
    return axios.get(`${API_BASE_URL}/courses`);
  },
  getCourse(id) {
    return axios.get(`${API_BASE_URL}/courses/${id}`);
  },
  createCourse(course) {
    return axios.post(`${API_BASE_URL}/courses`, course);
  },
  updateCourse(id, course) {
    return axios.put(`${API_BASE_URL}/courses/${id}`, course);
  },
  deleteCourse(id) {
    return axios.delete(`${API_BASE_URL}/courses/${id}`);
  },
};


