FROM registry.enncloud.cn/ennc/base-service:1.0.0
MAINTAINER zhangjianshe <zhangjsf@enn.cn>

# Install service software
ADD root /
RUN chmod 755 /opt/se-api/bin/*.sh
RUN chmod 755 /etc/periodic/daily/*

EXPOSE 8080