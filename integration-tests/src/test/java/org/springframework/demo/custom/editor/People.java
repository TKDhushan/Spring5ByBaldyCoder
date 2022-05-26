package org.springframework.demo.custom.editor;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/26 15:17
 * @description：自定义属性填充
 * @modified By：`
 * @version: 1.0
 */

public class People {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "People{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
