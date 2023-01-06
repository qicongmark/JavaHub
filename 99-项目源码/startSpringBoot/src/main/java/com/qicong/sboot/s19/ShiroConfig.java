package com.qicong.sboot.s19;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * User: 祁大聪
 */
@Configuration
public class ShiroConfig {

	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
		factoryBean.setSecurityManager(securityManager);
		factoryBean.setLoginUrl("/s19/login");
		
		Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
		filterChainDefinitionMap.put("/", "anon");
		filterChainDefinitionMap.put("/s19/login", "anon");//anon
		filterChainDefinitionMap.put("/s19/dologin", "anon");//anon
		filterChainDefinitionMap.put("/**", "anon");//authc，平时开发改成anon，允许匿名访问

		factoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return factoryBean;
	}

	@Bean
	public SessionsSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(authRealm());
		securityManager.setSessionManager(sessionManager());
		return securityManager;
	}

	@Bean
	public AuthRealm authRealm() {
		return new AuthRealm();
	}

	//去掉jsessionid小尾巴
	@Bean
	public DefaultWebSessionManager sessionManager() {
		//SessionIdUrlRewritingEnabled的默认值是false
		return new DefaultWebSessionManager();
	}
	
}

