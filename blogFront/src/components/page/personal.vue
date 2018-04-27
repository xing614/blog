<template>
<div>
  <div class="avatar"><a href="about.html"><span>关于paper</span></a></div>
  <div class="topspaceinfo">
    <h1>走得再远</h1>
    <p>也遇不见</p>
  </div>
  <div class="about_c">
    <p>姓名：paper梁</p>
    <p>职业：java </p>
    <p>地址：北京</p>
    <p>电话：xxx</p>
    <p>邮箱：xxxxxx</p>
  </div>
  <div class="bdsharebuttonbox">
    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间">
    </a>
    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a>
    <a href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a>
    <a href="#" class="bds_renren" data-cmd="renren" title="分享到人人网"></a>
    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
    <a href="#" class="bds_more" data-cmd="more"></a>
  </div>
</div>
</template>
<script>

</script>
<style scoped>
/* 右侧栏个人档案 */
.avatar { margin: 10px auto; width: 160px; height: 160px; border-radius: 100%; overflow: hidden; }
.avatar a { display: block; padding-top: 100px; width: 160px; background: url(../../assets/images/photos.jpg) no-repeat; background-size: 160px 160px; }
.avatar a span { display: block; margin-top: 63px; padding-top: 8px; width: 160px; height: 55px; text-align: center; line-height: 20px; color: #fff; background: rgba(0, 0, 0, .5); -webkit-transition: margin-top .2s ease-in-out; -moz-transition: margin-top .2s ease-in-out; -o-transition: margin-top .2s ease-in-out; transition: margin-top .2s ease-in-out; }
.avatar a:hover span { display: block; margin-top: 0; }
.topspaceinfo { background: #579dc5; padding: 40px 20px; color: #fff; text-shadow: 1px 1px rgba(0,0,0,.3); }
.topspaceinfo h1 { font-size: 16px; line-height: 30px; font-weight: bold; margin:0px;}
.topspaceinfo p {margin:0px;}
.about_c { margin: 10px 0; color: #fff; line-height: 26px; }
.about_c p:first-child, .about_c p:nth-child(2), .about_c p:nth-child(3), .about_c p:nth-child(4), .about_c p:last-child { background: url(../../assets/images/about_c.png) no-repeat; }
.about_c p:first-child { background-position: 15px 6px; }
.about_c p:nth-child(2) { background-position: 15px -20px }
.about_c p:nth-child(3) { background-position: 15px -48px }
.about_c p:nth-child(4) { background-position: 15px -70px }
.about_c p:last-child { background-position: 15px -97px }
.about_c p { display: block; padding-left: 40px; }
.about_c p:hover { background: #075498 }
.bdsharebuttonbox { margin: 20px; clear: both; }/* 百度分享 */
</style>
