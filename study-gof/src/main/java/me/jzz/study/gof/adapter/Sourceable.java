package me.jzz.study.gof.adapter;

/**
 * 目标接口
 * 2015-4-2
 * @author rono
 */
public interface Sourceable {
	/**
	 * 适配方法，与原生类中的方法相同
	 * @return
	 */
	public String methodA();
	/**
	 * 新类的方法
	 * @return
	 */
	public String methodB();
}
