<template>
  <div>
    <h1>这里是后台文本编译器</h1>
    <!--<button @click="getContent()">获取内容</button>-->
    <div class="ueditorContainer">
      <div id="titlediv">
          <h1 style="text-align:left;margin-top:10px;font-size: 16px;">
              <span style="font-size: 16px;"><strong>标题：</strong></span>
              <strong> </strong>
              <input id="title" v-model="title" type="text" style="font-size: 14px;padding:2px;" placeholder="请输入标题">
              <button class="saveButton" data-options="iconCls:'icon-save'" href="#" style="" @click="AddConvention()">保存</button>
          </h1>
      </div>
      <UEditor :defaultMsg=defaultMsg :config=config ref="ueditor"></UEditor>
    </div>
  </div>
</template>
<script>

import Personal from '@/components/page/personal.vue'
import UEditor from '@/components/page/ueditor/src/ueditor.vue'
export default {
	components: {UEditor},
  data () {
    return {
      defaultMsg: '这里是UE测试',
      config: {
        /*//可以在此处定义工具栏的内容
        toolbars: [
          ['fullscreen', 'source','|', 'undo', 'redo','|','bold', 'italic', 'underline', 'fontborder', 'strikethrough',
            '|','superscript','subscript','|', 'forecolor', 'backcolor','|', 'removeformat','|', 'insertorderedlist', 'insertunorderedlist',
            '|','selectall', 'cleardoc','fontfamily','fontsize','justifyleft','justifyright','justifycenter','justifyjustify','|',
            'link','unlink']
        ],*/
        autoHeightEnabled: false,
        autoFloatEnabled: true,　　//是否工具栏可浮动
        initialContent:'请输入内容',   //初始化编辑器的内容,也可以通过textarea/script给值，看官网例子
        autoClearinitialContent:true, //是否自动清除编辑器初始内容，注意：如果focus属性设置为true,这个也为真，那么编辑器一上来就会触发导致初始化的内容看不到了
        initialFrameWidth: 1156,//宽度最大可以用bull表示
        initialFrameHeight: 450,
        BaseUrl: '',
        UEDITOR_HOME_URL: 'static/ueditor/'
      },
      addFormVisible: false,
      title:''
    }
  },
  mounted(){

  },
  destoryed() {

  },
  methods:{
    openWindow: function(){
        this.addFormVisible = true;
    },
    //获取文档内容
    getContent: function(){
      let content = this.$refs.ueditor.getUEContent();
      console.log(content);
      return content;
    },
    AddConvention:function(){
      const self = this
      let articleContent = this.getContent();
      // let postData = this.$qs.stringify({
      //     'title':this.title,
      //     'articleContent':articleContent
      // });
      let param = new URLSearchParams();
      param.append("title", this.title);
      param.append("articleContent", articleContent);
      self.$axiosApi.post('/sendArticle', param, null, r => {
        alter(r)
      })
    }
  }
}
</script>
<style scoped>
.info{
  border-radius: 10px;
  line-height: 20px;
  padding: 10px;
  margin: 10px;
  background-color: #ffffff;
}
.ueditorContainer{
  margin:0 auto;
  width:1156px;
}
.saveButton{
  margin-left:80px;
  float:right;
  background:#fff;
  color:#000;
  padding:2px;
}
</style>
