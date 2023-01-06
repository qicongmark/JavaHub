
## SpringBoot整合Redis

一、本地先启动redis-server
	1、启动redis-cli 测试是否启动成功

二、添加Redis的依赖
	1、在pom.xml中添加Redis的jar包
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>

二、实现Redis整合
	1、Redis内置了连接参数
	2、修改：可以在 applicaiton.yml 配置
		spring:
			redis:
			    host: 127.0.0.1
			    port: 6379
			
三、代码实战
		
	
## 祁大聪讲编程

