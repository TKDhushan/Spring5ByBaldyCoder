package org.springframework.demo.factoryMethod;

/**
 * @author ：a123145
 * @date ：Created in 2022/6/2 08:19
 * @description：静态工厂
 * @modified By：`
 * @version: 1.0
 */

public class StudentStaticFactory {

	public static Student getStudent(String name){
		Student student = new Student();
		student.setId(1);
		student.setName(name);
		return student;
	}

	public static Student getStudent(String name,int id){
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;

	}

}
