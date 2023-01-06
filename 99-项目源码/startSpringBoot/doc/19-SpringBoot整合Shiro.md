
## SpringBoot整合Shiro

Shiro轻量级权限认证框架：拦截器对url拦截进行验证
(Spring Security)

一、添加Shiro的依赖
	1、在pom.xml中添加Shiro的jar包
		<dependency>
            <groupId>org.apache.shiro</groupId>
            <artifactId>shiro-spring-boot-web-starter</artifactId>
            <version>1.7.0</version>
        </dependency>
    
二、启动项目，提示Shiro报错
	1、创建AuthRealm：用于登录，设置权限
	2、创建ShiroConfig：做Shiro配置，拦截uri、注入sessionSecurity
	    2.1、匿名访问，不做url认证：filterChainDefinitionMap.put("/**", "anon");
				
三、代码实战


## 祁大聪讲编程

	