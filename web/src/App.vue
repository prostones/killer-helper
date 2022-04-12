<script setup lang="ts">

</script>

<template>
  <router-view v-slot="{ Component }">
    <transition name="fade">
      <component :is="Component" />
    </transition>
  </router-view>
</template>

<style lang="less">
#app{
  height: 100%;
}
</style>