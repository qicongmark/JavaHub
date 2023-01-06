
## SpringBoot整合MySQL连接驱动
电脑上已经安装了MySQL数据库

一、添加连接MySQL数据库的驱动依赖
	1、在pom.xml中添加连接MySQL的连接包
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.26</version>
		</dependency>

二、配置datasource数据源
	1、在 applicaiton.yml 添加MySQL连接配置
		spring:
			datasource:
			    driverClassName: com.mysql.cj.jdbc.Driver
			    url: jdbc:mysql://127.0.0.1:3306/learnmysql?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
			    username: root
			    password: root123

三、代码实战
	1、通过 JDBCTemplate 访问数据库
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
		

## 祁大聪讲编程

