<template>
  <div>
    <Header></Header>
    <article>
      <router-view></router-view>
    </article>
    <Footer></Footer>
  </div>
</template>
<script>
import Header from '../header.vue'
import Footer from '../footer.vue'
import Personal from '@/components/page/personal.vue'
import UlContainer from '@/components/page/ulContainer.vue'
import ListLink from '@/components/page/listLink.vue'
import StudyPage from '@/components/page/studyPage.vue'
import IndexPage from '@/components/page/indexPage.vue'
export default {
	components: { Header, Footer, Personal, UlContainer, ListLink, StudyPage, IndexPage},
  data () {
    return {
    }
  },
  mounted(){
    window.scrollReveal = new scrollReveal({reset: true});
    //this.scrollReveal = new scrollReveal({reset: true});//设置初始scrollreveal.js渲染
  }
}
</script>
<style scoped>
article {background: url(../../assets/images/articlebg.png) repeat; }/* 正body */
</style>
