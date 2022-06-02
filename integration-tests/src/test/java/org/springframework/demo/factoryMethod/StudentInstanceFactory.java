package org.springframework.demo.factoryMethod;

/**
 * @author ：a123145
 * @date ：Created in 2022/6/2 11:34
 * @description：实例工厂，非静态
 * @modified By：`
 * @version: 1.0
 */

public class StudentInstanceFactory {
	public Student getStudent(String name){
		Student student = new Student();
		student.setId(10);
		student.setName(name);
		return student;
	}
}
