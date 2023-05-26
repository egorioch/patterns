import { createApp } from 'vue'
import App from './App.vue'
import 'bootstrap/scss/bootstrap.scss'
import router from './router/router'

createApp(App)
    .use(router)
    .mount('#app')

import 'bootstrap/dist/js/bootstrap'