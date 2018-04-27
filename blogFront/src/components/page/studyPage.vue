<template>
  <div class="studyContent">
    <div class="container">
      <MainConTent></MainConTent>
    </div>
    <aside>
      <Personal></Personal>
      <AsideList></AsideList>
    </aside>
  </div>
</template>
<script>
import Personal from '@/components/page/personal.vue'
import MainConTent from '@/components/page/mainContent.vue'
import AsideList from '@/components/page/asideList.vue'
export default {
	components: {Personal, MainConTent, AsideList},
  data () {
    return {
    }
  }
}
</script>
<style scoped>
.studyContent .container{ width: 72%; float: left; background:#fff; overflow: hidden; margin: 10px; box-shadow: #075498 0px 1px 10px;}
aside { width: 22%;float: right; margin: 20px; }/* 右侧栏 */
</style>
