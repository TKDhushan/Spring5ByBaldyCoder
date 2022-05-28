package org.springframework.demo.entity;

/**
 * @author ：a123145
 * @date ：Created in 2022/2/13 22:36
 * @description：Spring IOC 学习 基础BEAN
 * @modified By：`
 * @version: 1.0
 */

public class User {

    public User(Long age, String name) {
        this.age = age;
        this.name = name;
    }

    private Long age;

    private String name;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
