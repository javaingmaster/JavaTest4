FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0

COPY start.sh  /start.sh
COPY ./target/JavaTest4-1.0-SNAPSHOT.jar  /java.jar
CMD ["/start.sh"]