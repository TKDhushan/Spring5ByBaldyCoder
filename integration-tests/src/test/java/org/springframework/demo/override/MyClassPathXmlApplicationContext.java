package org.springframework.demo.override;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/23 22:42
 * @description：为了演示Spring给我们留的扩展槽，启动类的对应方法需要重写
 * @modified By：`
 * @version: 1.0
 */

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String str){
		super(str);
	}

	@Override
	public void initPropertySources(){
		super.initPropertySources();
		//把"JAVA_HOME"作为启动的时候必须验证的环境变量
		getEnvironment().setRequiredProperties("JAVA_HOME");
		getEnvironment().setRequiredProperties("MLX");
		getEnvironment().setRequiredProperties("OUBA");
		getEnvironment().setRequiredProperties("HAHA");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowCircularReferences(false);
		//如果xml中不配置这个processor，也可以在此进行add
		//super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.postProcessBeanFactory(beanFactory);
		System.out.println("自定义扩展子类实现");
	}
}
