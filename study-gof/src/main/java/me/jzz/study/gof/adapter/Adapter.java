package me.jzz.study.gof.adapter;

/**
 * 面向类的适配器
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * 2015-4-2
 * @author rono
 */
public class Adapter extends Target implements Sourceable{
	/**
	 * 新类实现的方法，原来的类被适配
	 */
	@Override
	public String methodB() {
		return "new";
	}
}
