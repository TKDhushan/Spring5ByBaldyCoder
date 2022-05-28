package org.springframework.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/29 00:04
 * @description：源码学习debug propertysource
 * @modified By：`
 * @version: 1.0
 */

@Configuration
@PropertySource({"classpath:META-INF/myproperty.properties"})
public class MyPropertySource {

	@Value("${job}")
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "MyPropertySource{" +
				"job='" + job + '\'' +
				'}';
	}
}
