<template>
  <div class="adminGame">
      <CellGroup inset>
        <Field label="标题" v-model="detail.title" readonly></Field>
        <Field label="房间号" v-model="detail.code" readonly></Field>
        <Field label="总人数" v-model="detail.total" readonly></Field>
      </CellGroup>
      <CellGroup inset v-for="player in detail.players">
        <Field :label="'座位号'+player.number" v-model="player.role.code" readonly></Field>
      </CellGroup>
  </div>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router'
import { reactive, ref } from 'vue'
import { CellGroup, Field } from 'vant'
import { createRoom, backRoom, createByGameBookId } from '@/api/api'
import { Game } from '@/types/admin/index'
const detail = ref<Game>({
  id: '',
  code: '',
  players: [],
  title: '',
  total: ''
});

const router = useRouter()
const { code, number, gameBookId } = router.currentRoute.value.query

if (number) {
  create(number.toString())
} else if (code) {
  back(code.toString())
} else if (gameBookId) {
  create2(gameBookId.toString());
}

async function create(total: string) {
  const res = await createRoom(total)
  if (res.status === 500) {

  } else {
    detail.value = res.data
  }
}
async function create2(id: string) {
  const res = await createByGameBookId(id)
  if (res.status === 500) {

  } else {
    detail.value = res.data
  }
}
async function back(code: string) {
  const res = await backRoom(code)
  if (res.status === 500) {

  } else {
    detail.value = res.data
  }
}
</script>

<style>

</style>