
## 配置文件中的数据设置到Java的类中

一、通过 @Value 注解 和 Expression 表达式读取
	1、读取的是application.yml中的配置
    
二、自定义配置文件
	1、添加配置注解依赖
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <!-- 依赖不需要传递，子模块需要重新引用 -->
            <optional>true</optional>
        </dependency>
	2、创建 resource.yml
	3、创建 ResourceConfig.java
        @Configuration
        @ConfigurationProperties(prefix="com.qicong.website")
        @PropertySource(value = "classpath:resource.yml" , factory = YmlResourceFactory.class)
	4、创建YmlResourceFactory.java
	
## 祁大聪讲编程
