package me.jzz.study.gof.observer;

/**
 * 具体事件通知者
 * 2015-4-12
 * @author rono
 */
public class ConcreteSubject extends Subject{
	/**
	 * 实现父类的时间通知，可以完成自身一些业务逻辑
	 */
	@Override
	public String notifyObserver(String context) {
		// TODO Auto-generated method stub
		return super.notifyObserver(context);
	}
}
