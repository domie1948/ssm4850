import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import discussjingyanfenxiang from '@/views/modules/discussjingyanfenxiang/list'
    import discussruanjiantuijian from '@/views/modules/discussruanjiantuijian/list'
    import discussjihuafenxiang from '@/views/modules/discussjihuafenxiang/list'
    import wangzhituijian from '@/views/modules/wangzhituijian/list'
    import biaoqianfenlei from '@/views/modules/biaoqianfenlei/list'
    import forum from '@/views/modules/forum/list'
    import jingyanfenxiang from '@/views/modules/jingyanfenxiang/list'
    import ruanjiantuijian from '@/views/modules/ruanjiantuijian/list'
    import messages from '@/views/modules/messages/list'
    import jihuafenxiang from '@/views/modules/jihuafenxiang/list'
    import discusswangzhituijian from '@/views/modules/discusswangzhituijian/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '学习资讯',
        component: news
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/discussjingyanfenxiang',
        name: '经验分享评论',
        component: discussjingyanfenxiang
      }
          ,{
	path: '/discussruanjiantuijian',
        name: '软件推荐评论',
        component: discussruanjiantuijian
      }
          ,{
	path: '/discussjihuafenxiang',
        name: '计划分享评论',
        component: discussjihuafenxiang
      }
          ,{
	path: '/wangzhituijian',
        name: '网址推荐',
        component: wangzhituijian
      }
          ,{
	path: '/biaoqianfenlei',
        name: '标签分类',
        component: biaoqianfenlei
      }
          ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
          ,{
	path: '/jingyanfenxiang',
        name: '经验分享',
        component: jingyanfenxiang
      }
          ,{
	path: '/ruanjiantuijian',
        name: '软件推荐',
        component: ruanjiantuijian
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/jihuafenxiang',
        name: '计划分享',
        component: jihuafenxiang
      }
          ,{
	path: '/discusswangzhituijian',
        name: '网址推荐评论',
        component: discusswangzhituijian
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
