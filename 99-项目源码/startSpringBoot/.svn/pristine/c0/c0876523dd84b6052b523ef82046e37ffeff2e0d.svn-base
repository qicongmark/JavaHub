
## SpringBoot整合MyBatis
前提是：已经整合了 mysql-connector-java

一、添加MyBatis依赖
	1、在pom.xml中添加MyBatis的jar包
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>2.1.4</version>
		</dependency>

二、实现MyBatis整合
	1、在 application.yml 添加MyBatis配置
		mybatis:
			  type-aliases-package: com.qicong
			  config-locations: classpath:mybatis/mybatis-config.xml
			  mapper-locations: classpath:mybatis/mapper/*.xml
	2、在resources目录下创建 mybatis 文件夹
		2.1、添加 mybatis-config.xml
			<?xml version="1.0" encoding="UTF-8" ?>
			<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">
			<configuration>
				<settings>
					<setting name="mapUnderscoreToCamelCase" value="true" />
				</settings>
			</configuration>
	3、表student的sql
		
三、代码实战
	3.1、典型的业务三层结构：Controller——Service——Dao
	3.2、创建一个Service和Dao，Dao实现对数据库访问，Service和Dao都要加注解
	3.3、运行测试用例
	3.4、如果在Service中通过@Autowired注入Dao时，报错，
	     修改IDEA对Spring的验证级别即可：File ——》Settings ——》搜索 Inspections ——》找到Spring ——》修改Severity 为 warning 即可
	
    
## 祁大聪讲编程

