import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Detail from './views/Detail.vue'
import SearchPage from './views/SearchPage.vue'
// import ListComponent from './components/Recipe.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/food/list',
      name: 'home',
      component: Home
    },
    {
      path: '/recipedetail',
      name: 'recipedetail',
      component: Detail
    },
    {
      path:'/searchpage',
      name:'searchpage',
      component: SearchPage
    },
  ]
})
