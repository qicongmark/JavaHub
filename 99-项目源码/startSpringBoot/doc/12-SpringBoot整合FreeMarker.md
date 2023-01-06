
## SpringBoot 整合 FreeMarker

一、加入FreeMarker依赖的jar包
	1、pom.xml文件中添加依赖
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-freemarker</artifactId>
        </dependency>
	2、application.yml 文件中添加配置
		# FreeMarker
		spring:
		  freemarker:
		    cache: false
		    checkTemplateLocation: true
		    contentType: text/html
		    suffix: .html
		    templateEncoding: UTF-8
		    templateLoaderPath: classpath:templates
    
三、创建Controller实现MVC
	1、MVC设计模式
	2、代码实战
	3、字符串取值、对象取值、日期格式化
	
	
## 祁大聪讲编程

	