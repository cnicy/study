package me.jzz.study.gof.decorator;

/**
 * 自定义组件，可以对类进行装饰
 * 2015-4-6
 * @author rono
 */
public class ConcreteComponentB extends Decorator{
	@Override
	public String operation() {
		return "ConcreteComponentB:"+super.operation(); // 除了调用父类的方法外，还可以加上自身逻辑，相当于装饰
	}
}
