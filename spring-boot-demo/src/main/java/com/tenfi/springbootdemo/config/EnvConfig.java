package com.tenfi.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tenfi
 * @description 通过Value注解载入配置信息
 * @time 2021/7/30 14:45
 */
@Configuration
public class EnvConfig {
    // ${配置名：默认值}
    @Value("${urlEnv.url:128.0.0.1}")
    private String url;
    @Value("${urlEnv.port:1234}")
    private String port;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "EnvConfig{" +
                "url='" + url + '\'' +
                ", port='" + port + '\'' +
                '}';
    }

}
