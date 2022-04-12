<template>
  <div class="admin">
    <CellGroup>
      <Field v-model="code" label="房间" placeholder="请输入">
        <template #button>
          <van-button size="small" type="primary" @click="handleBack">重回房间</van-button>
        </template>
      </Field>
      <Field v-model="number" label="人数" placeholder="请输入">
        <template #button>
          <van-button size="small" type="primary" @click="handleCreate">创建房间</van-button>
        </template>
      </Field>
    </CellGroup>
  </div>
</template>

<script setup>
import { Field, CellGroup } from 'vant';
import { useRouter } from 'vue-router'
import {ref} from 'vue'
const code = ref('')
const number = ref('')
const router = useRouter()

function handleBack() {
  router.push({ path: '/adminGame', query: { code: code.value }})
}
function handleCreate() {
  router.push({ path: '/adminGame', query: { number: number.value }})
}
</script>

<style>

</style>