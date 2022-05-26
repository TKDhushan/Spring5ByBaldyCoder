package org.springframework.demo.custom.editor;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/26 15:14
 * @description：自定义属性填充
 * @modified By：`
 * @version: 1.0
 */

public class Address {

	private String province;
	private String city;
	private String town;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}
}
