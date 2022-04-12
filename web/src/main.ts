import {createApp} from 'vue'
import App from './App.vue'
import router from './router/index'
import {Button, Empty, Loading} from 'vant'
import './style/global.less'

const app = createApp(App)
app.use(router)
app.use(Button).use(Loading).use(Empty)
app.mount('#app')
