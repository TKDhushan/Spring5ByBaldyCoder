package org.springframework.demo.custom.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/26 15:20
 * @description：属性编辑器
 * @modified By：`
 * @version: 1.0
 */

public class AddressEditorSupport extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		this.setValue(address);
	}
}
