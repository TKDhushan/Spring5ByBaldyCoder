package org.springframework.demo.entity;

/**
 * @author ：a123145
 * @date ：Created in 2022/2/14 22:27
 * @description：循环引用demo bean
 * @modified By：`
 * @version: 1.0
 */

public class C {
    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
