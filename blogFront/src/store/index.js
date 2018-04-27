import Vue from 'vue'
import vuex from 'vuex'
Vue.use(vuex);

//import dialog_store from 'dialog_store.js';//引入dialog_store对象

export default new vuex.Store({
    state:{//数据源
      user:''
    },
    modules:{//引入其他store
      //dialog: dialog_store
    },
    mutations:{//通过提交 mutation 的方式，而非直接改变 store.state.count，是因为我们想要更明确地追踪到状态的变化。这个简单的约定能够让你的意图更加明显，这样你在阅读代码的时候能更容易地解读应用内部的状态改变。此外，这样也让我们有机会去实现一些能记录每次状态改变，保存状态快照的调试工具。有了它，我们甚至可以实现如时间穿梭般的调试体验。
      setUser(state,data){
        state.user = data
      }
    },
    getters:{
      getUser:state=>state.user
    }
})
