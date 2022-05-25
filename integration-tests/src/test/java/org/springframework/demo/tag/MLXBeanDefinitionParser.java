package org.springframework.demo.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/25 17:51
 * @description：MLX标签的自定义解析器
 * @modified By：`
 * @version: 1.0
 */

public class MLXBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	/**
	 * @param element the {@code Element} that is being parsed
	 * @return 返回属性值对应的对象,目的是把标签对象，与bean进行绑定
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		return MLX.class;
	}

	/**
	 *
	 * @param element the XML element being parsed
	 * @param builder used to define the {@code BeanDefinition}
	 * 自定义解析器
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String name = element.getAttribute("name");
		String age = element.getAttribute("age");

		if(StringUtils.hasText(name)){
			builder.addPropertyValue("name",name);
		}

		if(StringUtils.hasText(name)){
			builder.addPropertyValue("age",age);
		}
	}
}
