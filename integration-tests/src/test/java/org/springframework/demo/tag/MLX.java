package org.springframework.demo.tag;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/25 17:44
 * @description：自定义标签
 * @modified By：`
 * @version: 1.0
 */
//自定义标签 mlx 标签属性 name  age
public class MLX {


	private String id;
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
