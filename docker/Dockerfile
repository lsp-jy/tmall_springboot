# 拉取JDK8的系统镜像
From java:8
# 设置时区
ENV TZ=Asia/Shanghai
# 时区写入系统文件
RUN ln -snf /usr/share/zoneinfo/$TZ  /etc/localtime && echo $TZ > /etc/timezone

VOLUME /tmp
# 加入打包好的jar文件(xxxxx改为自己文件名)
ADD ./tmall_springboot-0.0.1-SNAPSHOT.jar /

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmall_springboot-0.0.1-SNAPSHOT.jar"]

#进入docker目录下，执行下面两条命令
#docker build --rm -f "Dockerfile" -t java-hello:latest .
#docker images（可以查看创建好的docker镜像）
#docker run -d -P --name 容器名称 镜像名称(向宿主机开放所有的端口)
