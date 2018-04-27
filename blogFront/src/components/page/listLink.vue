<template>
  <div class="tj_news">
    <h2>
      <p class="tj_t1">最新文章</p>
    </h2>
    <ul>
      <li><a href="/">犯错了怎么办？</a></li>
      <li><a href="/">两只蜗牛艰难又浪漫的一吻</a></li>
      <li><a href="/">春暖花开-走走停停-发现美</a></li>
      <li><a href="/">琰智国际-Nativ for Life官方网站</a></li>
      <li><a href="/">个人博客模板（2014草根寻梦）</a></li>
      <li><a href="/">简单手工纸玫瑰</a></li>
      <li><a href="/">响应式个人博客模板（蓝色清新）</a></li>
      <li><a href="/">蓝色政府（卫生计划生育局）网站</a></li>
    </ul>
  </div>
</template>
<script>

export default {
  data () {
    return {
    }
  }
}
</script>
<style scoped>
.tj_news h2, .links h2 { font-size: 16px; font-family: "Microsoft Yahei", Arial, Helvetica, sans-serif; color: #FFF; }
.tj_news h2 p, .links h2 p { height: 40px; line-height: 40px; width: 130px; padding: 0 0 0 30px; border-radius: 0 20px 20px 0; text-shadow: rgba(0,0,0,.65) 1px 1px; }
.tj_t1 { background: #0f9c7c }
.tj_t2 { background: #b0e516 }
.tj_news ul { margin: 20px 0 20px 0px }
.tj_news ul li a:hover, .links ul li a:hover { text-decoration: underline; color: #FFF }
.tj_news ul li { height: 25px; line-height: 25px; clear: both; padding-left: 5px; overflow: hidden; padding-left: 15px; background: url(../../assets/images/li.jpg) no-repeat left center; }
.tj_news ul li a, .links ul li a { color: #bbbbbb; }
</style>
