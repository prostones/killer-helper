<template>
  <div class="playerGame">
      playerGame
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
const router = useRouter()
const { code, number } = router.currentRoute.value.query
console.log(code, number);
</script>

<style>

</style>