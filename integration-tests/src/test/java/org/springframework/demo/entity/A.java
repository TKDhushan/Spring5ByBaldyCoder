package org.springframework.demo.entity;

/**
 * @author ：a123145
 * @date ：Created in 2022/2/14 22:26
 * @description：循环引用demo bean
 * @modified By：`
 * @version: 1.0
 */

public class A {
    private  B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
