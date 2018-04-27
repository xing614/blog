<template>
  <div class="indexContent">
    <div class="container">
      <UlContainer></UlContainer>
    </div>
    <aside>
      <Personal></Personal>
      <ListLink></ListLink>
    </aside>
  </div>
</template>
<script>
import Personal from '@/components/page/personal.vue'
import UlContainer from '@/components/page/ulContainer.vue'
import ListLink from '@/components/page/listLink.vue'
export default {
	components: {Personal, UlContainer, ListLink},
  data () {
    return {
    }
  }
}
</script>
<style scoped>
.indexContent .container{ width: 72%; float: left; background: url(../../assets/images/articlebg.png) repeat; overflow: hidden; margin: 10px; box-shadow: #075498 0px 1px 10px;}
aside { width: 22%;float: right; margin: 20px; }/* 右侧栏 */
</style>
