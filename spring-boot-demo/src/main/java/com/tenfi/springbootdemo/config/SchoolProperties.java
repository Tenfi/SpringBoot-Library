package com.tenfi.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Tenfi
 * @description 通过ConfigurationProperties注解载入配置信息
 * @time 2021/7/30 15:17
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolProperties {
    // 默认值直接写
    private String address="beijing";
    private String name="qinghua";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolProperties{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
