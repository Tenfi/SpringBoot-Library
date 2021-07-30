package com.tenfi.springbootdemo.configTest;

import com.tenfi.springbootdemo.config.SchoolProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tenfi
 * @description
 * @time 2021/7/30 15:20
 */
@SpringBootTest
public class SchoolTest {
    @Autowired
    SchoolProperties schoolProperties;
    @Test
    public void doTest() {
        System.out.println(schoolProperties.toString());
    }
}
