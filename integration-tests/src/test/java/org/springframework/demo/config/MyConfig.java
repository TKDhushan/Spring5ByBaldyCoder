package org.springframework.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.demo.entity.MyEntity;
import org.springframework.demo.entity.User;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/28 22:52
 * @description：配置类
 * @modified By：`
 * @version: 1.0
 */
@Configuration
@ComponentScan("org.springframework.demo.tag")
public class MyConfig {

	@Configuration
	@ComponentScan("org.springframework.demo.tag")
	@Order(60)
	class MyInnerClass1{

	}

	@Configuration
	@ComponentScan("org.springframework.demo.tag")
	@Order(70)
	class MyInnerClass2{

	}

{}	@Bean
	public MyEntity getMyEntity(){
		return new MyEntity("maolixin");
	}

	@Override
	public String toString() {
		return "this is MyConfig toString";
	}
}
