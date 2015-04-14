package me.jzz.study.gof.template;

/**
 * 具体实现的模板方法
 * 2015-4-12
 * @author rono
 */
public class ConcreteA extends Template{
	@Override
	public String operation1() {
		return "ConcreteA-operation1";
	}

	@Override
	public String operation2() {
		return "ConcreteA-operation2";
	}
}
