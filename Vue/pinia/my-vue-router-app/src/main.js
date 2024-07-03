import { createApp } from "vue";
import "./style.css";
import App from "./App.vue";
import router from "./router/index";
import "@fortawesome/fontawesome-free/css/all.css";
import { createPinia } from "pinia";
import { Quasar } from "quasar";

import "@quasar/extras/material-icons/material-icons.css";

import "quasar/src/css/index.sass";

const pinia = createPinia();
createApp(App)
  .use(Quasar, {
    plugins: {},
  })
  .use(pinia)
  .use(router)
  .mount("#app");
