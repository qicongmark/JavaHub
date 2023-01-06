
## SpringBoot自定义拦截器
Shiro的底层就是通过拦截器实现的，开发者也可以自定义拦截器

一、自定义拦截器
	1、自己创建拦截器类，实现：HandlerInterceptor接口
	2、创建MVC的配置(拦截器的)类，实现：WebMvcConfigurer接口
	    2.1、addInterceptors中：可以添加多个拦截器，每个拦截器可以添加多个PathPatterns
    
二、代码实战

## 祁大聪讲编程

