package me.jzz.study.gof.observer;

/**
 * 抽象观察者，为所以观察者定义一个接口，在得到主题更新时通知自己
 * 2015-4-12
 * @author rono
 */
public interface Observer {
	/**
	 * 通知自己后，逻辑就写在下面方发里面
	 */
	public String update(String context);
}
