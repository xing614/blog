export default{
  data:{
      authenticated:false,
      Authorization:''
  },
  login(current,info,success,failure){
    const self = this;
    let data = {'username':info.username,'password':info.password};
    console.log(data)
    current.$api.post('/ajaxLogin',data,null,r =>{
      console.log(r);
      if(r.code!=0 ||r.data.token==null){
        failure(r);
      }else{
        localStorage.setItem('token',r.data.token);
        self.authenticated = true;
        self.Authorization = r.data.token;
        //加了封装就不能这么写了，不知道为什么会报错，
        //axios.defaults.headers.common['Authorization'] = this.Authorization;
        success(r);
      }
    },r=>{
      alert("网络错误，请稍候再试");
    })
    //current.$api.setAxiosHeaders('Authorization',self.Authorization);
  },
  getAuthHeader(){
      return {
          'Authorization':'Bearer '+localStorage.getItem('token')//localStorage是永久有效不清空，存放在硬盘里，不安全，还是换成sessionStorage好，只在浏览器期间保存，之后消失
      }
  },
  checkAuth(){
      var token = localStorage.getItem('token')
      if(token){
          this.authenticated = true
      }else{
          this.authenticated = false
      }
  }
}
