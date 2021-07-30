package com.tenfi.springbootdemo.configTest;

import com.tenfi.springbootdemo.config.TeacherProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tenfi
 * @description
 * @time 2021/7/30 16:55
 */
@SpringBootTest
public class TeacherTest {
    @Autowired
    TeacherProperties teacherProperties;
    @Test
    public void doTest() {
        System.out.println(teacherProperties.toString());
    }
}
