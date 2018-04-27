<template>
  <div id="asideCategory" class="aside-box flexible-box">
      <h3 class="aside-title">个人分类</h3>
      <div class="aside-content">
          <ul>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7244234">
                      while循环结构                    <span class="count float-right">3篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7245127">
                      函数的运用                    <span class="count float-right">13篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7267153">
                      数据结构与算法                    <span class="count float-right">25篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7268734">
                      for循环结构                    <span class="count float-right">17篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7283493">
                      一维数组                    <span class="count float-right">19篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7339790">
                      二维数组                    <span class="count float-right">5篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7342622">
                      运算符重载                    <span class="count float-right">4篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7350049">
                      指针的应用                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7350162">
                      函数模板                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7350164">
                      面向对象设计函数模板                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7350172">
                      面向对象设计函数                    <span class="count float-right">2篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7350210">
                      类与对象的构造和应用                    <span class="count float-right">7篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7367163">
                      面向对象继承与派生                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7367405">
                      多态性和虚函数                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7367416">
                      多态性与虚函数                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7367936">
                      杂项                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7369614">
                      字符数组的应用                    <span class="count float-right">1篇</span>
                  </a>
              </li>
              <li>
                  <a href="https://blog.csdn.net/qq_40014462/article/category/7520822">
                      Java语言程序设计基础                    <span class="count float-right">42篇</span>
                  </a>
              </li>
          </ul>
      </div>
          <p class="text-center">
          <a class="btn btn-link-blue flexible-btn" data-fbox="aside-archive">展开</a>
      </p>
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
div.aside-box {
    margin-bottom: 8px;
    background-color: #fff;
    -webkit-box-shadow: 0 2px 4px 0 rgba(0,0,0,0.05);
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.05);
}
div.aside-box h3.aside-title {
    padding: 16px 16px 0;
    font-size: 14px;
    color: #333;
}
div.aside-box h3.aside-title::before {
    display: inline-block;
    margin-right: 8px;
    content: '';
    width: 4px;
    height: 22px;
    vertical-align: -6px;
    background-color: #ca0c16;
}

*, *::before, *::after {
    -webkit-box-sizing: inherit;
    box-sizing: inherit;
    outline: 0;
}
#asideCategory.flexible-box div.aside-content, aside #asideArchive.flexible-box div.aside-content, aside #asideNewArticle.flexible-box div.aside-content {
    max-height: 150px;
    overflow: hidden;
}
div.aside-box div.aside-content {
    padding: 16px;
    overflow: hidden;
}
.flexible-box div.aside-content {
    padding-bottom: 0 !important;
}
#asideCategory ul, aside #asideArchive ul, aside #asideNewArticle ul {
    margin-top: -8px;
}
div.aside-box div.aside-content * {
    word-break: break-all;
}
#asideCategory ul li, aside #asideArchive ul li, aside #asideNewArticle ul li {
    margin-top: 8px;
}
#asideCategory ul li a, aside #asideArchive ul li a, aside #asideNewArticle ul li a {
    display: block;
    color: #333;
}
div.aside-box a {
    color: #333;
    cursor: pointer;
}
#asideCategory ul li a span.count, aside #asideArchive ul li a span.count, aside #asideNewArticle ul li a span.count {
    font-size: 12px;
    color: #858585;
}
.pull-right, .float-right {
    float: right !important;
}
#asideCategory ul li a, aside #asideArchive ul li a, aside #asideNewArticle ul li a {
    display: block;
    color: #333;
}
.text-center {
    text-align: center;
}
.flexible-box a.flexible-btn {
    font-size: 12px;
}
.btn-link-blue {
    color: #79a5e5 !important;
}
.btn {
    margin-left: 8px;
    margin-right: 8px;
    margin-top: 6px;
    margin-bottom: 6px;
    padding: 0 8px;
    display: inline-block;
    font-size: 14px;
    border-radius: 4px;
    text-align: center;
    border: none;
    background-color: transparent;
    height: 34px;
    line-height: 32px;
    min-width: 72px;
    cursor: pointer;
}

</style>
