import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import About from './views/About.vue'
import Loginview from './views/Loginview.vue'
import Detail from './views/Detail.vue'
// import ListComponent from './components/Recipe.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/food/:page',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      component: About
    },
    {
      path: '/login',
      name: 'login',
      component: Loginview
    },
    {
      path: '/recipedetail',
      name: 'recipedetail',
      component: Detail
    },
    {
      path: '/food/list',
      name: 'pagelist',
      component: Home
    }

  ]
})
