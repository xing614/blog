// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

// 引用API文件 axios封装
import axiosApi from './api/axiosApi.js'
// 将API方法绑定到全局
Vue.prototype.$axiosApi = axiosApi

// 引用工具文件
import utils from './utils/index.js'
// 将工具方法绑定到全局
Vue.prototype.$utils = utils

// 引入token设定文件
import tokenUse from './api/tokenUse.js'
Vue.prototype.$token = tokenUse

//vuex ,好像会地总调用文件夹下的index.js
import store from './store'

import $ from 'jquery'

import 'assets/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js'
import 'assets/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css'

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
   store,//使用store
  components: { App },
  template: '<App/>'
})
