<template>
  <div class="content">
    <MsgThought></MsgThought>
    <LeaveSaying></LeaveSaying>
  </div>
</template>
<script>
import MsgThought from '@/components/page/msgThought.vue'
import LeaveSaying from '@/components/page/leaveSaying.vue'
export default {
	components: {MsgThought,LeaveSaying},
  data () {
    return {
    }
  }
}
</script>
<style scoped>

</style>
