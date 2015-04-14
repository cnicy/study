package me.jzz.study.gof.observer;

/**
 * 具体对象观察者
 * 2015-4-12
 * @author rono
 */
public class ConcreteObserver implements Observer{
	private String name;
	
	public ConcreteObserver(String name) {
		this.name = name;
	}
	/**
	 * 接到通知后做出逻辑操作
	 */
	@Override
	public String update(String context) {
		return name+"-"+context;
	}
}
