package org.springframework.demo.factoryMethod;

/**
 * @author ：a123145
 * @date ：Created in 2022/6/2 08:22
 * @description：工厂创建的bean
 * @modified By：`
 * @version: 1.0
 */

public class Student {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
