<template>
  <div>
		<Header></Header>

		<div class="article_list">
      <div class="login-wrap" v-show="showLogin">
          <h3>登录</h3>{{this.$store.getters.getUser}}
          <p v-show="showTishi">{{tishi}}</p>
          <input type="text" placeholder="请输入用户名" v-model="username">
          <input type="password" placeholder="请输入密码" v-model="password">
          <!-- <button v-on:click="login">登录</button>-->
          <button v-on:click="ajaxLogin">登录</button>
          <span v-on:click="ToRegister">没有账号？马上注册</span>
      </div>

      <div class="register-wrap login-wrap" v-show="showRegister">
          <h3>注册</h3>
          <p v-show="showTishi">{{tishi}}</p>
          <input type="text" placeholder="请输入用户名" v-model="newUsername">
          <input type="password" placeholder="请输入密码" v-model="newPassword">
          <input type="text" placeholder="请输入邮件" v-model="newEmail">
          <button v-on:click="register">注册</button>
          <span v-on:click="ToLogin">已有账号？马上登录</span>
      </div>









			<ul>
				<li v-for="i in list" :key="i.id">
					<!-- 使用utils包的goodTime方法-->
					<time v-text="$utils.goodTime(i.create_at)"></time>
					<router-link :to="'/content/' + i.id">
						{{ i.title }}
					</router-link>
				</li>
			</ul>



		</div>
		<Footer></Footer>
	</div>
</template>
<script>
//判断jquery是否载入
// $(function () {
//     alert(123);
//  });

import Header from '../header.vue'
import Footer from '../footer.vue'
export default {
	components: { Header, Footer },
	data () {
		return {
      showLogin: true,
      showRegister: false,
      showTishi: false,
      tishi:'',
      username:'admin',
      password:'123456',
      newUsername:'',
      newPassword:'',
      newEmail:'',
			list: []
		}
	},
	created () {
		this.getData()
	},
	methods: {
		getData () {
		// 	this.$axiosApi.get('topics', null, r => {
		// 		this.list = r.data
		// 	})
      // this.$axiosApi.get('admin/role', {id:1}, r => {
      //   console.log(r.data)
      // })
      // this.$axiosApi.get('admin/select', {id:1}, r => {
      //   console.log(r.data)
      // })
		},
    login(){
      const self = this
      if(this.username == "" || this.password == ""){
           alert("请输入用户名或密码")
        }else{
            let data = {'username':this.username,'password':this.password};
            /*接口请求*/
            self.$axiosApi.post('/ajaxLogin', data, null, r => {
              self.tishi = "该用户不存在"
              self.showTishi = true
              if(r.data == null){
                self.tishi = "该用户不存在"
                self.showTishi = true
              }else{
                self.tishi = "登录成功"
                self.showTishi = true
                self.$axiosApi.setAxiosHeaders('Authorization',this.$token.Authorization);
                setTimeout(function(){
                    self.$router.push({path:'home'})
                }.bind(this),1000)
              }
            })
        }
    },
    ToRegister(){
      this.showRegister = true
      this.showLogin = false
    },
    register(){
      let data = {
        username:this.newUsername,
        password:this.newPassword,
        email:this.newEmail
      }
      this.$axiosApi.post('/ajaxRegister',data, null,r => {
        alert(r.msg)
        if(r.code == 5)
          this.ToLogin();
      })
    },
    ToLogin(){
      this.showRegister = false
      this.showLogin = true
    },
    ajaxLogin(){
      const self=this;
      var info = {
        username: this.username,
        password: this.password
      }
      self.$token.login(self,info,r => {
        //在axios设置全局token
        self.$axiosApi.setAxiosHeaders('Authorization',this.$token.Authorization);
        //由于动态路由也是传递params的，所以在 this.$router.push() 方法中path不能和params一起使用，否则params将无效。需要用name来指定页面
        //self.$router.push({path:'home',params:{"user":"aaa"}})
        self.$router.push({name:'Home',params:{"user":r.data.user}})
        //还可以使用query进行传参，然后也要利用query获取
        self.$store.commit('setUser',r.data.user)
      },r=>{
        alert(r.msg);
      }
      );
    }
	}
}
</script>
<style scoped>
.login-wrap{text-align:center;}
input{display:block; width:250px; height:40px; line-height:40px; margin:0 auto; margin-bottom: 10px; outline:none; border:1px solid #888; padding:10px; box-sizing:border-box;}
p{color:red;}
button{display:block; width:250px; height:40px; line-height: 40px; margin:0 auto; border:none; background-color:#41b883; color:#fff; font-size:16px; margin-bottom:5px;}
span{cursor:pointer;}
span:hover{color:#41b883;}
</style>
