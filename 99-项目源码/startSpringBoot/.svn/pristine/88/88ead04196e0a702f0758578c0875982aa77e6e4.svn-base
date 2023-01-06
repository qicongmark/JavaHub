
## SpringBoot实现国际化

一、国际化
	1、就是根据不同的浏览器语言，加载不同的配置文件
	2、springboot默认就支持国际化的
	3、只需要在resources/下创建国际化配置文件即可，名称以messages开始
    
二、实现国际化 （i18n：internationalization）
	1、创建 resources目录和国际化配置文件
		messages.properties（默认）
		messages_zh_CN.properties（中文）
		messages_en_US.properties（英文）
	2、application.yml中配置
		spring:
			messages:
			    basename: i18n/messages
			    encoding: UTF-8
	3、借助FreeMarker实现国际化
        3.1、在html头部添加<#import "spring.ftl" as s>
        3.2、使用<@s.message code="welcome" />即可
	4、添加拦截器，根据我们选择的语言切换国际化
		4.1、I18nLocaleConfig.java

## 祁大聪讲编程



