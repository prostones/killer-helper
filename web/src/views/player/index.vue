<template>
  <div class="player">
    <Form @submit="onSubmit">
      <CellGroup>
        <Field v-model="code" label="房间" placeholder="请输入" />
        <Field v-model="number" label="座位号" placeholder="请输入" />
      </CellGroup>
      <div style="margin: 16px;">
        <van-button round block type="primary" native-type="submit">
          提交
        </van-button>
      </div>
    </Form>
  </div>
</template>

<script setup lang="ts">
import { Form, Field, CellGroup } from 'vant';
import { useRouter } from 'vue-router'
import {ref} from 'vue'
const code = ref('')
const number = ref('')
const router = useRouter()

function onSubmit() {
  router.push({ path: '/playerGame', query: { code: code.value, number:number.value } })
}
</script>

<style>

</style>