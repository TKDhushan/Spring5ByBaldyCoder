package org.springframework.demo.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/25 18:00
 * @description：处理器
 * @modified By：`
 * @version: 1.0
 */

public class MLXNamespaceHandler extends NamespaceHandlerSupport {
	//此类在DefaultNamespaceHandlerResolver.resolve中会自动调用init方法
	//MLXNamespaceHandler类必须是NamespaceHandler的子类
	@Override
	public void init() {
		registerBeanDefinitionParser("mlx",new MLXBeanDefinitionParser());
	}
}
