package org.springframework.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.entity.User;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/20 18:46
 * @description：学习Spring源码测试类
 * @modified By：`
 * @version: 1.0
 */

public class MyTest {

	@Test
	void sourceCodeEntry(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/spring.xml");
		//实时加载
		User user = (User)beanFactory.getBean("user");
		System.out.println("实时查找：" + user);
	}
}
