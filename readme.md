<div align="center">

<h1>狼人杀发牌器</h1>

<p>仅用于桌游社团狼人杀游戏，不可替代上帝！！！</p>

<a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
    <img src="https://img.shields.io/badge/JDK-8+-green.svg" />
</a>
<img src="https://img.shields.io/badge/Spring%20Boot-2.5.6-green.svg" >
<img src="https://img.shields.io/badge/Redis-5.0-green.svg" >
<img src="https://img.shields.io/badge/npm-6.14-green.svg" >
<img src="https://img.shields.io/docker/v/pro4stones/killer-helper?sort=semver" >

---

![](.readme_images/c2fd6.gif)

</div>

### 功能列表

* 上帝发牌
* 上帝重回房间
* 玩家落座获取身份

### 计划功能

* 完成前段工作
* 增加角色卡片图片
* 上帝控制倒牌
* 投票统计

### 丝袜哥

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### 录本的朋友请前往

```
=> com.nbteam.killer.helper.enums.RoleEnum // 增加角色
=> com.nbteam.killer.helper.repository.GameBookRepositoryImpl // 增加板子
```

```
docker stack deploy -c docker-compose.yml k

docker-compose pull
docker-compose up -d

```
