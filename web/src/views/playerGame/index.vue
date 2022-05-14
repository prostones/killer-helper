<template>
  <div class="playerGame">
    <CellGroup inset>
      <Field label="标题" v-model="detail.title" readonly></Field>
      <Field label="房间号" v-model="detail.code" readonly></Field>
    </CellGroup>
    <CellGroup inset v-for="player in detail.players">
      <Field :label="'座位号' + player.number" v-model="player.role.code" readonly></Field>
      <Field :label="'角色描述'" v-model="player.role.description" readonly type="textarea" autosize></Field>
    </CellGroup>
    <CellGroup inset v-if="detail.showTeam">
      <Field label="队友" v-model="detail.showTeam" readonly></Field>
    </CellGroup>
  </div>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router'
import { reactive, ref } from 'vue'
import { CellGroup, Field, Notify } from 'vant'
import { comingRoom } from '@/api/api'
import { Game } from '@/types/admin/index'
const detail = ref<Game>({
  id: '',
  code: '',
  players: [],
  title: '',
  total: '',
  showTeam: ''
});

const router = useRouter()
const { code, number } = router.currentRoute.value.query

if (number && code) {
  coming(code.toString(), number.toString())
}

async function coming(code: string, number: string) {
  const res = await comingRoom(code, number)
  if (res.status === 500) {
    Notify(res.message)
  } else {
    detail.value = res.data
    if (detail.value.team && Array.isArray(detail.value.team)) {
      const tArr: string[] = []
      detail.value.team.forEach(t => {
        if (t.number !== detail.value.players[0].number) {
          tArr.push(`座位号${t.number}`)
        }
      })
      detail.value.showTeam = tArr.join('，')
    }
  }
}
</script>

<style>
</style>