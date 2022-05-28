package org.springframework.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/29 00:35
 * @description：Conditional注解练习
 * @modified By：`
 * @version: 1.0
 */

public class MacCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String property = context.getEnvironment().getProperty("os.name");
		if(property.equals("Mac OS X")){
			return true;
		}
		return false;
	}
}
