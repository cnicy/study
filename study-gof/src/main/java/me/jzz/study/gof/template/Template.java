package me.jzz.study.gof.template;

public abstract class Template {
	public abstract String operation1();
	
	public abstract String operation2();
	
	
	public String operation3(){
		return "operation3";
	}
	/**
	 * 定义主方法，用于调用实现类的方法，该主方法可以被继承
	 * @return
	 */
	public String exeTemplateMethod(){
		return operation1() +"+"+ operation2()+"+"+operation3();
	}
}
