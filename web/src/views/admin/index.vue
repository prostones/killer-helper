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
      <Field
        v-model="gameBookId"
        is-link
        readonly
        name="picker"
        label="板子"
        placeholder="点击选择"
        @click="showPicker = true"
      >
      </Field>
      <Popup v-model:show="showPicker" position="bottom">
        <Picker
          :columns="columns"
          @confirm="onConfirm"
          @cancel="showPicker = false"
          :columns-field-names="{text: 'title'}"
        />
      </Popup>
    </CellGroup>
  </div>
</template>

<script setup lang="ts">
import { Field, CellGroup, Popup, Picker } from 'vant'
import { useRouter } from 'vue-router'
import {ref} from 'vue'
import { queryGameBook } from '@/api/api'
const code = ref('')
const number = ref('')
const gameBookId = ref('')
const columns = ref([])
const showPicker = ref(false)
const router = useRouter()
getGameBook()
function handleBack() {
  router.push({ path: '/adminGame', query: { code: code.value }})
}
function handleCreate(gameBookId: string) {
  router.push({ path: '/adminGame', query: { number: number.value, gameBookId }})
}

function onConfirm(value: any) {
  console.log('value', value)
  handleCreate(value.id)
}
async function getGameBook() {
  const res = await queryGameBook()
  console.log('res', res);
  
  if(res.status===200) {
    columns.value = res.data
  } else {
    columns.value = []
  }
  
}
</script>

<style>

</style>