# spring cloud 配置中心示例

> 博客地址：[Spring Cloud Config Demo（外部集中化配置管理示例）](https://blog.csdn.net/qq_32828253/article/details/113528854)



## 模块说明
- eureka-server：注册中心服务
- config-server：配置服务提供者
- config-client：使用配置的client
- 


## FAQ
- config-client启动一直报 config.info无法注入？
config-client模块的配置文件名称需要为`bootstrap.yml`
检查版本是否匹配

