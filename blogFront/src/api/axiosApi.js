// 接口调用工具
// 配置API接口地址
//var root = 'https://cnodejs.org/api/v1'
var root = 'http://127.0.0.1:8081'
// 引用axios
var axios = require('axios')
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded'

//设置axios头
function setAxiosHeaders(name,value){
  axios.defaults.headers.common[name] = value;
}
// 自定义判断元素类型JS
function toType (obj) {
  return ({}).toString.call(obj).match(/\s([a-zA-Z]+)/)[1].toLowerCase()
}
// 参数过滤函数
function filterNull (o) {
  for (var key in o) {
    if (o[key] === null) {
      delete o[key]
    }
    if (toType(o[key]) === 'string') {
      o[key] = o[key].trim()
    } else if (toType(o[key]) === 'object') {
      o[key] = filterNull(o[key])
    } else if (toType(o[key]) === 'array') {
      o[key] = filterNull(o[key])
    }
  }
  return o
}
/*
  接口处理函数
  可以通过向 axios 传递相关配置来创建请求
  该函数对应每个项目是不一样的，处理方法不同，参数返回形式不同。需要根据实际调整。
  目前设置返回值包含code,msg,data三个参数.code为0表示请求成功
*/

function apiAxios (method, url, params, header,success, failure) {
  if (params) {
    params = filterNull(params)
  }
  axios({
    method: method,
    url: url,
    data: method === 'POST' || method === 'PUT' ? params : null,
    params: method === 'GET' || method === 'DELETE' ? params : null,
//    params: params,
    headers: header !== null ? header:null,
    baseURL: root,
    withCredentials: false,
    headers:{'X-Requested-With': 'XMLHttpRequest'}//这玩意还要自己主动加上，才会在请求中设置？？。。。
  })
    // .then(function (res) {
    //   if (res.data.success === true) {
    //     if (success) {
    //       success(res.data)
    //     }
    //   } else {
    //     if (failure) {
    //       failure(res.data)
    //     } else {
    //       window.alert('error: ' + JSON.stringify(res.data))
    //     }
    //   }
    // })
    .then(function (res) {
      console.log("success+"+JSON.stringify(res));
      if (res.status === 200) {
        if (success) {
          success(res.data);
        }
      } else {
        if (failure) {
          failure(res.data);
        } else {
          window.alert('error: ' + JSON.stringify(res.data));
        }
      }
    })
    .catch(function (err) {
      console.log("failure+"+err);
      let res = err.response;
      if (err) {
        //先注释了，不然axios.defaults.headers.common['Authorization'] = token;会报错
        //window.alert('api error, HTTP CODE: ' + res.status);
      }
    });
}

// 返回在vue模板中的调用接口
export default {
  get: function (url, params, header, success, failure) {
    return apiAxios('GET', url, params, header, success, failure);
  },
  post: function (url, params, header, success, failure) {
    return apiAxios('POST', url, params, header, success, failure);
  },
  put: function (url, params, header, success, failure) {
    return apiAxios('PUT', url, params, header, success, failure);
  },
  delete: function (url, params, header, success, failure) {
    return apiAxios('DELETE', url, params, header, success, failure);
  },
  setAxiosHeaders:function(name,value){
    return setAxiosHeaders(name,value);
  }
}
