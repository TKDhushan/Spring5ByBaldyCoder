package org.springframework.demo.custom.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/26 15:25
 * @description：编辑器对应的注册器
 * @modified By：`
 * @version: 1.0
 */

public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {


	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		//通过PropertyEditorRegistry 绑定属性与Editor
		registry.registerCustomEditor(Address.class,new AddressEditorSupport());
	}
}
