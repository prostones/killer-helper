<template>
  <div class="adminGame">
      adminGame
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
const router = useRouter()
const { code, number } = router.currentRoute.value.query

</script>

<style>

</style>