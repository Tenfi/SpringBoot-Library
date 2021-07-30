package com.tenfi.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Tenfi
 * @description yml中嵌套结构及相互引用
 * @time 2021/7/30 16:32
 */
@Component
@ConfigurationProperties(prefix = "teacher")
public class TeacherProperties {
    private SchoolProperties school = new SchoolProperties();
    private Map<StudentEnum, Student> student = new EnumMap<>(StudentEnum.class);

    private static class Student {
        private String name = "";
        private int age = 0;
        private Set<String> subjects = new HashSet<>();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Set<String> getSubjects() {
            return subjects;
        }

        public void setSubjects(Set<String> subjects) {
            this.subjects = subjects;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", subjects=" + subjects +
                    '}';
        }
    }

    public SchoolProperties getSchool() {
        return school;
    }

    public void setSchool(SchoolProperties school) {
        this.school = school;
    }

    public Map<StudentEnum, Student> getStudent() {
        return student;
    }

    public void setStudent(Map<StudentEnum, Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "TeacherProperties{" +
                "schoolProperties=" + school +
                ", studentMap=" + student +
                '}';
    }

    private enum StudentEnum {
        BOY, GIRL
    }
}
