import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Login from '../components/Login.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Login
    },
    {
      path:'/DashboardMedico',
      name:'DashboardMedico',
      component: ()=>import('../components/PainelMedico.vue')
    }
    ,
    {
      path:'/DashboardUtente',
      name:'DashboardUtente',
      component: ()=>import('../components/PainelUtente.vue')
    }
  ]
})

export default router
