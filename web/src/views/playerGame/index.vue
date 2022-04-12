<template>
  <div class="playerGame">
      <CellGroup inset>
        <Field label="标题" v-model="detail.title" readonly></Field>
        <Field label="房间号" v-model="detail.code" readonly></Field>
      </CellGroup>
      <CellGroup inset v-for="player in detail.players" >
        <Field :label="'座位号'+player.number" v-model="player.role.code" readonly></Field>
      </CellGroup>
  </div>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router'
import { reactive, ref } from 'vue'
import { CellGroup, Field } from 'vant'
import { comingRoom } from '@/api/api'
import { Game } from '@/types/admin/index'
const detail = ref<Game>({
  id: '',
  code: '',
  players: [],
  title: '',
  total: ''
});

const router = useRouter()
const { code, number } = router.currentRoute.value.query

if (number&&code) {
  coming(code.toString(), number.toString())
}

async function coming(code: string, number: string) {
  const res = await comingRoom(code, number)
  if (res.status === 500) {

  } else {
    detail.value = res.result
  }
}
</script>

<style>

</style>