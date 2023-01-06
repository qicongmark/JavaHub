package com.qicong.sboot.s19;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * User: 祁大聪
 */
public class AuthRealm extends AuthorizingRealm {

    //返回用户的角色和权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //设置用户的角色权限
        return null;
    }

    //实现用户的登录行为
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        String password = new String((char[])token.getCredentials());

        System.out.println("username = " + username + ", password = " + password);
        //去访问数据库，进行用户的用户名、密码的校验

        //直接写死了
        if("qicong".equals(username) && "qicong".equals(password)){
            return new SimpleAuthenticationInfo(username,password,getName());
        }
        throw new AuthenticationException();
    }

}
