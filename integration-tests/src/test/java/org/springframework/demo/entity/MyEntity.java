package org.springframework.demo.entity;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/28 23:17
 * @description：测试entity
 * @modified By：`
 * @version: 1.0
 */

public class MyEntity {
	private String name;

	public MyEntity(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyEntity{" +
				"name='" + name + '\'' +
				'}';
	}
}
