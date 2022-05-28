package org.springframework.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.demo.entity.User;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/29 00:31
 * @description：@Bean注解源码分析+@Conditional注解源码分析
 * @modified By：`
 * @version: 1.0
 */

@Configuration
@Conditional({org.springframework.demo.condition.MacCondition.class})
public class MyBeanConfig {

	@Bean("lucy")
	public User getUser(){
		return new User(18L,"秃子");
	}

	@Bean("lily")
	@Conditional({org.springframework.demo.condition.LinuxCondition.class})
	public User getUser2(){
		return new User(18L,"飘逸");
	}
}
