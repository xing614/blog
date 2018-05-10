<template>
  <article>
    <div class="container">
      <h2 class="ctitle"><b>留言板</b> <span>你，生命中最重要的过客，之所以是过客，因为你未曾为我停留。</span></h2>
      <div class="gbook">
        <div class="about">
          <div id="fountainG">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
          </div>
          <div class="about_girl"><span><a href="/"><img src="../../assets/images/girl.jpg"></a></span>
            <p>当您驻足停留过，从此便注定我们的缘分。站在时间的尽头，我们已是朋友，前端的路上我再也不用一个人独自行走。</p>
          </div>
        </div>
      </div>
    </div>
    </aside>
  </article>
</template>
<script>
export default {
	components: {},
  data () {
    return {
    }
  }
}
</script>
<style scoped>
.gbook { margin: 30px }
/* loading  */
#fountainG { position: relative; width: 240px; height: 29px; margin-bottom: 30px }
#fountainG li { position: absolute; top: 0;/* background: #6dabdc; 默认颜色 */ width: 29px; height: 29px; -moz-animation: bounce_fountainG 1.2s linear infinite; -moz-transform: scale(.3); -moz-border-radius: 19px; -webkit-animation: bounce_fountainG 1.2s linear infinite; -webkit-transform: scale(.3); -webkit-border-radius: 19px; -ms-animation: bounce_fountainG 1.2s linear infinite; -ms-transform: scale(.3); -ms-border-radius: 19px; -o-animation: bounce_fountainG 1.2s linear infinite; -o-transform: scale(.3); -o-border-radius: 19px; animation: bounce_fountainG 1.2s linear infinite; transform: scale(.3); border-radius: 19px; }
#fountainG li:first-child { left: 0; -moz-animation-delay: 0.48s; -webkit-animation-delay: 0.48s; -ms-animation-delay: 0.48s; -o-animation-delay: 0.48s; animation-delay: 0.48s; }
#fountainG li:nth-child(2) { left: 30px; -moz-animation-delay: 0.6s; -webkit-animation-delay: 0.6s; -ms-animation-delay: 0.6s; -o-animation-delay: 0.6s; animation-delay: 0.6s; }
#fountainG li:nth-child(3) { left: 60px; -moz-animation-delay: 0.72s; -webkit-animation-delay: 0.72s; -ms-animation-delay: 0.72s; -o-animation-delay: 0.72s; animation-delay: 0.72s; }
#fountainG li:nth-child(4) { left: 90px; -moz-animation-delay: 0.84s; -webkit-animation-delay: 0.84s; -ms-animation-delay: 0.84s; -o-animation-delay: 0.84s; animation-delay: 0.84s; }
#fountainG li:nth-child(5) { left: 120px; -moz-animation-delay: 0.96s; -webkit-animation-delay: 0.96s; -ms-animation-delay: 0.96s; -o-animation-delay: 0.96s; animation-delay: 0.96s; }
#fountainG li:nth-child(6) { left: 150px; -moz-animation-delay: 1.08s; -webkit-animation-delay: 1.08s; -ms-animation-delay: 1.08s; -o-animation-delay: 1.08s; animation-delay: 1.08s; }
#fountainG li:nth-child(7) { left: 180px; -moz-animation-delay: 1.2s; -webkit-animation-delay: 1.2s; -ms-animation-delay: 1.2s; -o-animation-delay: 1.2s; animation-delay: 1.2s; }
#fountainG li:nth-child(8) { left: 210px; -moz-animation-delay: 1.32s; -webkit-animation-delay: 1.32s; -ms-animation-delay: 1.32s; -o-animation-delay: 1.32s; animation-delay: 1.32s; }
 @-moz-keyframes bounce_fountainG { 0% {
-moz-transform:scale(1);
background-color:#6dabdc;
}
 100% {
-moz-transform:scale(.3);
background-color:#FFFFFF;
}
}
 @-webkit-keyframes bounce_fountainG { 0% {
-webkit-transform:scale(1);
background-color:#6dabdc;
}
 100% {
-webkit-transform:scale(.3);
background-color:#FFFFFF;
}
}
 @-ms-keyframes bounce_fountainG { 0% {
-ms-transform:scale(1);
background-color:#6dabdc;
}
 100% {
-ms-transform:scale(.3);
background-color:#FFFFFF;
}
}
 @-o-keyframes bounce_fountainG { 0% {
-o-transform:scale(1);
background-color:#6dabdc;
}
 100% {
-o-transform:scale(.3);
background-color:#FFFFFF;
}
}
 @keyframes bounce_fountainG { 0% {
transform:scale(1);
background-color:#6dabdc;
}
 100% {
transform:scale(.3);
background-color:#FFFFFF;
}
}
/* about */
.about { padding: 20px 0; overflow: hidden }
.about ul { width: 1000px; margin: auto; line-height: 24px }
.about_girl span img { width: 130px; height: 130px; border-radius: 100% }
.about_girl { width: 100%; margin: 10px auto 0; overflow: hidden }
.about_girl span { float: left; margin-right: 30px }
.about_girl p { margin: 20px; background: #ececec; color: #444; float: left; padding: 20px; width: 46%; border-radius: 6px; position: relative; box-shadow: inset #999 -1px -1px 1px; ; text-shadow: #fff 1px 1px 0px; width: 450px }
.about_girl p::before { content: ""; width: 0px; height: 0px; border-style: solid; border-width: 20px 20px 20px 0; border-color: transparent #ececec transparent; position: absolute; left: -20px; top: 24px; }/* 三角形 */
.gbko {
    background: rgb(255, 255, 255);
    padding: 0 30px 30px 30px;
    margin: 30px;
    border-radius: 15px;
}
</style>
