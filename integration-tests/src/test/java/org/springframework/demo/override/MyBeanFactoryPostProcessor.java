package org.springframework.demo.override;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.demo.aware.RoleSonAware;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/24 11:37
 * @description：为了实现ignoreDependency的测试
 * @modified By：`
 * @version: 1.0
 */

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.ignoreDependencyInterface(RoleSonAware.class);//测试ignoreDependencyInterface方法作用
		//beanFactory.ignoreDependencyType(RoleDady.class);//测试ignoreDependencyType方法作用
	}
}
