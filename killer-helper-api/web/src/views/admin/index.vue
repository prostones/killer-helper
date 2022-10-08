<template>
  <div class="admin">
    <CellGroup>
      <Field v-model="code" label="房间" placeholder="请输入" type="digit">
        <template #button>
          <van-button size="small" type="primary" @click="handleBack">重回房间</van-button>
        </template>
      </Field>
      <!-- 暂时不需要人数 -->
      <!-- <Field v-model="number" label="人数" placeholder="请输入" type="digit">
        <template #button>
          <van-button size="small" type="primary" @click="handleCreate">创建房间</van-button>
        </template>
      </Field> -->
      <Field name="switch" label="黑死病">
        <template #input>
          <Switch v-model="check" size="20"/>
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
          v-if="!number"
      >
      </Field>
      <Popup v-model:show="showPicker" position="bottom">
        <Picker
            :columns="columns"
            @confirm="onConfirm"
            @cancel="showPicker = false"
        />
      </Popup>
    </CellGroup>
  </div>
</template>

<script setup lang="ts">
import {useRouter} from 'vue-router'
import {ref} from 'vue'
import {queryGameBook} from '@/api/api'

const code = ref<string>('')
const number = ref<string>('')
const check = ref<boolean>(false)
const gameBookId = ref<string>('')
const columns = ref([])
const showPicker = ref(false)
const router = useRouter()
getGameBook()

function handleBack() {
  router.push({path: '/adminGame', query: {code: code.value}})
}

function handleCreate(gameBookId: string) {
  const isBdModal: string = check.value ? '1' : '0'
  router.push({path: '/adminGame', query: {number: number.value, gameBookId, isBdModal}})
}

function onConfirm(value: any) {
  number.value = ''
  handleCreate(value.id)
}

async function getGameBook() {
  const res = await queryGameBook()
  console.log('res', res);

  if (res.status === 200) {
    res.data.forEach((r: { id: string; text: string; total: any; title: any }) => {
      r.text = `(${r.total})${r.title}`
    })
    columns.value = res.data
  } else {
    columns.value = []
  }

}
</script>

<style>

</style>