# 构建mysql容器

FROM mysql:5.7.25

# allow no password
ENV MYSQL_ALLOW_EMPTY_PASSWORD yes

# copy file into container
COPY setup.sh /mysql/setup.sh
COPY schema.sql /mysql/schema.sql
COPY privileges.sql /mysql/privileges.sql

# exec these command when container start up
CMD ["sh", "/mysql/setup.sh"]

#进入docker目录下，执行下面两条命令
#docker build --rm -f "Dockerfile" -t mysql-tmall:latest .
#docker images（可以查看创建好的docker镜像）
#docker run mysql-tmall:latest