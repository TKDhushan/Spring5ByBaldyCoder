package org.springframework.demo.entity;

/**
 * @author ：a123145
 * @date ：Created in 2022/2/14 22:26
 * @description：循环引用 demo bean
 * @modified By：`
 * @version: 1.0
 */

public class B {
    private  C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
