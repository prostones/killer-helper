<template>
  <div class="home">
    <div class="panel-top">
      <img src="@/assets/home.gif" alt="图片加载中">
    </div>
    <Row gutter="20" justify="center">
      <Col span="12" style="text-align:center">
        <van-button round plain type="primary" size="normal" to="admin">我是上帝</van-button>
      </Col>
      <Col span="12" style="text-align:center">
        <van-button round plain type="success" size="normal" to="player">我是玩家</van-button>
      </Col>
    </Row>
  </div>
</template>

<script setup lang="ts"></script>

<style lang="less" scoped>
.home {
  height: 100%;

  .panel-top {
    height: 75%;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
  }
}
</style>