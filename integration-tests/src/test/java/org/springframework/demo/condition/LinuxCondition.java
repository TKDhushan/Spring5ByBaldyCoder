package org.springframework.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/29 00:46
 * @description：Linux的系统Condition
 * @modified By：`
 * @version: 1.0
 */

public class LinuxCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String property = context.getEnvironment().getProperty("os.name");
		if(property.equals("Linux")){
			return true;
		}
		return false;
	}
}
