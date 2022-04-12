<template>
  <div class="home">
    <div style="height:40%"></div>
    <Row gutter="20" justify="center">
      <Col span="12" style="text-align:center">
        <van-button round  plain type="primary" size="normal" to="admin">我是上帝</van-button>
      </Col>
      <Col span="12" style="text-align:center">
        <van-button round  plain type="success" size="normal" to="player">我是玩家</van-button>
      </Col>
    </Row>
  </div>
</template>

<script setup>
import { Col, Row } from 'vant';

</script>

<style lang="less" scoped>
.home{
  height: 100%;
}
</style>