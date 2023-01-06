package com.qicong.sboot.s08;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.util.Properties;

/**
 * User: 祁大聪
 * 固定写法，可以放到自己的util包中，供平时使用
 */
public class YmlResourceFactory extends DefaultPropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        factory.afterPropertiesSet();
        Properties ymlProperties = factory.getObject();
        String propertyName = name != null ? name : resource.getResource().getFilename();
        return new PropertiesPropertySource(propertyName, ymlProperties);
    }

}
