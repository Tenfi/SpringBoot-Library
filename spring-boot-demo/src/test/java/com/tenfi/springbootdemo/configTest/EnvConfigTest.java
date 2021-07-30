package com.tenfi.springbootdemo.configTest;

import com.tenfi.springbootdemo.config.EnvConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tenfi
 * @description
 * @time 2021/7/30 15:01
 */
@SpringBootTest
public class EnvConfigTest {
    @Autowired
    EnvConfig envConfig;

    @Test
    public void doTest() {
        System.out.println(envConfig.toString());
    }
}
