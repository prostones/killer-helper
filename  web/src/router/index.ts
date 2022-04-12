import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: () => import('@/views/home/index.vue')
  }, {
    path: '/admin',
    name: 'admin',
    component: () => import('@/views/admin/index.vue'),
  }, {
    path: '/player',
    name: 'player',
    component: () => import('@/views/player/index.vue'),
  },
  {
    path: '/adminGame',
    name: 'adminGame',
    component: () => import('@/views/adminGame/index.vue'),
  },
  {
    path: '/playerGame',
    name: 'playerGame',
    component: () => import('@/views/playerGame/index.vue'),
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router

