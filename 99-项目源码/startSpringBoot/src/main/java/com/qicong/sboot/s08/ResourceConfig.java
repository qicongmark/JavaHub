package com.qicong.sboot.s08;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * User: 祁大聪
 */
@Configuration
@ConfigurationProperties(prefix = "com.wesite")
@PropertySource(value = "classpath:resource.yml", factory = YmlResourceFactory.class)
public class ResourceConfig {

    private String name;
    private String url;
    private String date;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
