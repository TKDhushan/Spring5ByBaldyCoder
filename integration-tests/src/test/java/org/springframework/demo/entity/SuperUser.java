package org.springframework.demo.entity;


/**
 * @author ：a123145
 * @date ：Created in 2022/2/13 23:17
 * @description：User的子类，超级用户
 * @modified By：`
 * @version: 1.0
 */
public class SuperUser extends User{

    private String addr;

    @Override
    public String toString() {
        return "SuperUser{" +
                "addr='" + addr + '\'' +
                "} " + super.toString();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
