
## SpringBoot 项目结构介绍
一、pom.xml文件
	1、maven构建项目的标志性文件
	2、文件内容介绍
	3、External Libraries：项目依赖的jar包（maven管理）
	
二、src 目录
	1、main：开发的主要目录
		2.1、java：开发java代码的目录
		2.2、resources目录，资源目录
				2.2.1、static，静态文件目录
                        比如css、js、图片、静态html等
				2.2.2、templates，动态html所在目录
                        一般是Controller请求后返回的目录，通过模板引擎配置即可
				2.2.3、application.properties
                        配置文件，比如tomcat的端口号、数据库连接参数等等
	2、test目录：测试用例目录
	3、target目录：maven项目打包后的输出目录

三、SpringBoot项目和非SpringBoot项目对比
	1、和qdcSpring项目比较
	

## 祁大聪讲编程

	