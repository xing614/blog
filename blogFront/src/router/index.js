import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/page/login'
import Content from '@/components/page/content'
import Main from '@/components/page/main'
import Home from '@/components/page/home'
import Whole from '@/components/page/whole'
import IndexPage from '@/components/page/indexPage'
import StudyPage from '@/components/page/studyPage'
import AboutMe from '@/components/page/aboutMe'
import LeaveMsgPage from '@/components/page/leaveMsgPage'
import DailyLife from '@/components/page/dailyLife'
import UEditorContent from '@/components/page/uEditorContent'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'whole',
      component:Whole,
      children: [
        {
          path:'/',
          redirect: '/indexPage'
        },
        {
          path: '/indexPage',
          name: 'IndexPage',
          component: IndexPage
        },
        {
          path: '/studyPage',
          name: 'StudyPage',
          component: StudyPage
        },
        {
          path: '/aboutMe',
          name: 'AboutMe',
          component: AboutMe
        },{
          path: '/leaveMsgPage',
          name: 'LeaveMsgPage',
          component: LeaveMsgPage
        },{
          path: '/dailyLife',
          name: 'DailyLife',
          component: DailyLife
        }
      ]
    },
    {
      path: '/login',
      name: 'login',
      component:Login
    },{
      path: '/content/:id',
      component: Content
    },{
      path: '/main',
      name: 'Main',
      component: Main
    },{
      path: '/home',
      name: 'Home',
      component: Home
    },{
      path: '/uEditorContent',
      name: 'UEditorContent',
      component: UEditorContent
    }
  ]
})
