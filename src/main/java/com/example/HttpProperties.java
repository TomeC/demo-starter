package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "http") // 自动获取配置文件中的属性，把值传入对象参数
public class HttpProperties {

    // 如果配置了属性，则该属性会被覆盖
    private String url = "http://www.baidu.com/";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
