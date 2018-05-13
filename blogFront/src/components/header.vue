<template>
  <header class="header">
    <div class="logo" data-scroll-reveal="enter right over 1s">
      <a href="/">
        <h1>paper梁</h1>
      </a>
    </div>
    <nav class="topnav" data-scroll-reveal="enter bottom over 1s after 1s">
      <router-link to="/indexPage">
        <span>首页</span>
        <span class="en">Home</span>
      </router-link>
      <router-link to="/aboutMe">
        <span>关于我</span>
        <span class="en">About</span>
      </router-link>
      <router-link to="/dailyLife">
        <span>日常碎语</span>
        <span class="en">Life</span>
      </router-link>
      <router-link to="/studyPage">
        <span>学习笔记</span>
        <span class="en">Learn</span>
      </router-link>
      <router-link to="/leaveMsgPage">
        <span>留言</span>
        <span class="en">Saying</span>
      </router-link>
    </nav>
  </header>

</template>
<script>
export default {
  data () {
    return {
        //scrollReveal:scrollReveal()//不写好像也没事？
    }
  },
  created :function() {
  },
  mounted(){
    //window.scrollReveal = new scrollReveal({reset: true});
    //this.scrollReveal = new scrollReveal({reset: true});//设置初始scrollreveal.js渲染
  },
  methods:{
  }
}
</script>
<style scoped>
img { border: 0; display: block }
a:link, a:visited, a:active { text-decoration: none; color: #fff }
a:hover { text-decoration: none; color: #fff; }
.logo { margin: 40px 0 }
nav { margin-bottom: 40px }
nav a { position: relative; display: inline-block; font-size: 18px; margin-right: 30px }
.topnav a span:first-child { z-index: 2; display: block; }
.topnav a span:last-child { z-index: 1; display: block; color: #fff; opacity: 0; -webkit-transition: -webkit-transform 0.3s, opacity 0.3s; -moz-transition: -moz-transform 0.3s, opacity 0.3s; transition: transform 0.3s, opacity 0.3s; -webkit-transform: translateY(-100%); -moz-transform: translateY(-100%); transform: translateY(-100%); text-align: center }
.topnav a:hover span:last-child, .topnav a:focus span:last-child { opacity: 1; -webkit-transform: translateY(0%); -moz-transform: translateY(0%); transform: translateY(0%); }
.en { color: #fff; font-size: 12px; z-index: 1; display: block; }
</style>
