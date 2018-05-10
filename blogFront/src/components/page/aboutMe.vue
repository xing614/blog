<template>
  <div>
    <div class="container aboutme">
      <div class="banner">
        <p data-scroll-reveal="enter top over 2s">我们不停的翻弄着回忆，却再也找不回那时的自己</p>
        <p data-scroll-reveal="enter left over 2s after 1s">人生，是一场盛大的遇见。若你懂得，就请珍惜。</p>
        <p data-scroll-reveal="enter bottom over 2s after 2s">无论下多久的雨，最后都会有彩虹；无论你多么悲伤，要相信幸福在前方等候.</p>
      </div>
      <div class="memorial_day">
        <div class="time_axis"></div>
        <ul>
          <li class="n1"><a href="/">前端入行</a>
            <div class="dateview">2009</div>
          </li>
          <li class="n2"><a href="/">创建个人博客</a>
            <div class="dateview">2011-01-12</div>
          </li>
          <li class="n3"><a href="/">分享第一个博客模板</a>
            <div class="dateview">2013-06-08</div>
          </li>
          <li class="n4"><a href="/">制作第一个html5模板</a>
            <div class="dateview">2013-08-08</div>
          </li>
          <li class="n5"><a href="/">模板更换为时间轴</a>
            <div class="dateview">2017-09-08</div>
          </li>
        </ul>
      </div>
      <div class="about left">
    <h2>Just about me</h2>
      <ul>
       <p>从搬砖一样的生活方式换成了现在有“单”而居的日子。当然这个单不是单身的单，跟我的职业相比，爱情脱单并不是问题！虽然极尽苛刻的征婚条件但也远不及客户千奇百怪的要求。告别了朝九晚五，躲过了风吹日晒，虽然不再有阶梯式的工资，但是偶尔可以给自己放放假，挽着老公，一起轻装旅行。</p>
    <p>
    人生就是一个得与失的过程，而我却是一个幸运者，得到的永远比失去的多。生活的压力迫使我放弃了轻松的前台接待，放弃了体面的编辑，换来虽有些蓬头垢面的工作，但是我仍然很享受那些熬得只剩下黑眼圈的日子，因为我在学习使用Photoshop、Flash、Dreamweaver、ASP、PHP、JSP...中激发了兴趣，然后越走越远....</p>

      </ul>
      <h2>About my blog</h2>
      <p>域  名：www.yangqq.com 创建于2011年01月12日 </p>
      <p>服务器：阿里云服务器<a href="https://promotion.aliyun.com/ntms/act/ambassador/sharetouser.html?userCode=8smrzoqa&amp;productCode=vm" target="_blank" class="blog_link">购买空间</a><a href="/jstt/web/2014-01-18/644.html" target="_blank" class="blog_link">参考我的空间配置</a></p>
      <p>程  序：PHP 帝国CMS7.0</p>


    </div>
    </div>
    </aside>
  </div>
</template>
<script>

export default {
	components: { },
  data () {
    return {
    }
  }
}
</script>
<style scoped>
.aboutme{
  width:1110px;color:#fff;
}
/* banner */
.banner { height: 180px; text-align: center; overflow: hidden; margin: 30px; line-height: 30px; text-shadow: #fff 1px 1px 1px; background: url(../../assets/images/banner_top.jpg) no-repeat -90px center; color: #333; padding: 40px 0 0 0 }
/*文字动画效果*/

/*纪念日*/
.memorial_day { overflow: hidden; position: relative; padding: 60px; }
.time_axis { background: #e9f5fb; height: 6px; width: 100%; animation: time_a 5s; -moz-animation: time_a 5s; /* Firefox */ -webkit-animation: time_a 5s; /* Safari and Chrome */ -o-animation: time_a 5s; /* Opera */ }
/*时间轴动画效果*/
@keyframes time_a { 0% {
width:0px;
}
25% {
width:250px;
}
50% {
width:500px;
}
100% {
width:840px;
}
}
 @-moz-keyframes time_a /* Firefox */ { 0% {
width:0px;
}
25% {
width:250px;
}
50% {
width:500px;
}
100% {
width:840px;
}
}
 @-webkit-keyframes time_a /* Safari and Chrome */ { 0% {
width:0px;
}
25% {
width:250px;
}
50% {
width:500px;
}
100% {
width:840px;
}
}
 @-o-keyframes time_a /* Opera */ { 0% {
width:0px;
}
25% {
width:250px;
}
50% {
width:500px;
}
100% {
width:840px;
}
}
.dateview { position: absolute; top: -50px; left: 20px; display: block; width: 88px; background: url(../../assets/images/dtime.png) no-repeat; color: #FFF; height: 46px; line-height: 30px; text-align: center }
.memorial_day ul li a { margin-top: 30px; display: block; color: #fff }
.memorial_day ul li a:hover { text-decoration: underline }
.memorial_day ul li::before { content: ""; width: 14px; height: 14px; border-radius: 50%; position: absolute; background: #0979b1; border: 3px solid #e9f6fb; }
.memorial_day ul li:hover::before { background: #075498; border: 3px solid #e9f6fb; }
.memorial_day ul li.n1 { position: absolute; top: 54px; left: 90px }
.memorial_day ul li.n2 { position: absolute; top: 54px; left: 220px }
.memorial_day ul li.n3 { position: absolute; top: 54px; left: 390px }
.memorial_day ul li.n4 { position: absolute; top: 54px; left: 580px }
.memorial_day ul li.n5 { position: absolute; top: 54px; left: 790px }
.about { width: 90%; margin: 30px auto; overflow: hidden; line-height: 22px; }
.about h2 { font-size: 22px; margin-bottom: 20px; background: #2a7497; padding: 10px 0; width: 200px; text-align: center; border-radius: 0 30px 30px 0; box-shadow: #21566f 1px 1px 1px; border-left: #dae1e4 6px solid; }
.about p { margin-bottom: 20px }
.about ul { }
.about_c { padding: 10px 0 0 10px; color: #999; line-height: 26px; }
.about_c img { margin: 5px 0 }
.about_c span { color: #19A566 }
a.blog_link { color: #95cdff; margin: 0 20px }
h4.atitle {
    font-size: 18px;
    margin-bottom: 30px;
    /* text-align: center; */
}
h4.atitle span{ float:right;color:#fff}
.gbko {
    background: rgb(255, 255, 255);
    padding: 0 30px 30px 30px;
    margin: 30px;
    border-radius: 15px;
}
.otherlink{overflow: hidden;}
.otherlink ul { margin: 10px 0 }
.otherlink li { line-height: 24px; height: 24px; display: block; width: 290px; float: left; overflow: hidden; margin-right: 30px; }
.otherlink li a:hover{ text-decoration:underline}
.infops{ margin:0 0 20px 0}
.infops p{ line-height:24px;margin-bottom: 5px;}
.about p img{ margin:auto}
.bt-blue{/* background: url(../../assets/images/5817.png) no-repeat 20px center #47A9FF;*/ padding:5px 10px 5px 20px; width:90px; text-align:center; line-height:40px; font-weight:bold; margin-bottom:10px}
.bt-blue a{ color:#fff;}
.ps{ color:#4bcfef}
.shili {background-color: rgb(34, 26, 189);padding: 10px;border: 1px dotted rgb(119, 136, 85);word-wrap: break-word;}
.bt-cs{background:#f90;padding:5px 10px;}
.bt-cs a{color:#fff}

</style>
