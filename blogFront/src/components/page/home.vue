<template>
    <div>
        <h3>欢迎{{this.$route.params.user.username}} {{name}} {{this.$store.getters.getUser.username}}</h3>
        <button @click="getEmail()">Get Email</button>
        <button @click="getEmail2()">Get Email2</button>
        <h3>{{email}}</h3>
        <a href="#" @click="quit">注销登录</a>
    </div>
</template>

<script>
export default{
    data(){
        return{
            name: '',
            email:''
        }
    },
    mounted(){

    },
    beforeCreate(){
        //如果没有token的话需要重新登录
         if(!this.$token.authenticated){
            this.$router.push({name:'login'})
        }
    },
    created(){
        this.name = this.$route.params.user.username
    },
    methods:{
        quit(){
          this.$axiosApi.setAxiosHeaders('Authorization',null);
          this.$token.authenticated = null;//这是保证前端跳转回登陆界面
          this.$router.push({name:'login'});
        },
        getEmail(){
          const self = this;
          //self.$axiosApi.get('/getEmail',null,{'Authorization':self.$token.Authorization},r=>{
          self.$axiosApi.get('/getEmail',null,null,r=>{
            if(r.code != 0)
              alert(r.msg);
            else
              self.email=r.data.email;
          },r=>{
            console.log(r)
          })
        },
        getEmail2(){
          const self = this;
          //self.$axiosApi.get('/getEmail',null,{'Authorization':self.$token.Authorization},r=>{
          self.$axiosApi.get('/manager/getEmail',null,null,r=>{
            if(r.code != 0)
              alert(r.msg);
            else
              self.email=r.data.email+"1";
          },r=>{
            console.log(r)
          })
        }
    }
}
</script>
