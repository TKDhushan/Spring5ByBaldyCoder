package org.springframework.demo.override;

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
}
