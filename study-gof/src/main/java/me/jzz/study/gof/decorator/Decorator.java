package me.jzz.study.gof.decorator;

/**
 * 装饰抽象类，从外类来扩展component的功能
 * @see http://www.cnblogs.com/java-my-life/archive/2012/04/20/2455726.html
 * 2015-4-4
 * @author rono
 */
public abstract class Decorator extends Component{
	private Component component;
	
	/**
	 * 装饰器利用该方法进行对象包装，这样如何装饰对象和如何使用对象分离
	 * @param component
	 */
	public void setComponent(Component component){
		this.component = component;
	}
	
	/**
	 * 实际执行的是传入的component的类的方法
	 */
	@Override
	public String operation() {
		if(null!=component)
			return component.operation();
		
		return null;
	}
}
