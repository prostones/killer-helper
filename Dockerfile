# 基础镜像
FROM azul/zulu-openjdk:8
# 作者
MAINTAINER nbteam
# 把可执行jar包复制到基础镜像的根目录下
ADD target/killer-helper.jar /killer-helper.jar

# 镜像要暴露的端口
EXPOSE 8080
# 在镜像运行为容器后执行的命令
ENTRYPOINT ["java","-jar","-Xmx512m","/killer-helper.jar"]