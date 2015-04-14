package me.jzz.study.gof.template;

/**
 * 具体实现的模板方法
 * 2015-4-12
 * @author rono
 */
public class ConcreteB extends Template{
	@Override
	public String operation1() {
		return "ConcreteB-operation1";
	}

	@Override
	public String operation2() {
		return "ConcreteB-operation2";
	}
}
