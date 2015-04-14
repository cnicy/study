package me.jzz.study.gof.iterator;

/**
 * 迭代抽象方法
 * 2015-4-12
 * @author rono
 */
public interface Iterator {
	/**
	 * 前置元素
	 * @return
	 */
	public Object previous();
	/**
	 * 后置元素
	 * @return
	 */
	public Object next();
	/**
	 * 是否存在下一个元素
	 * @return
	 */
	public Boolean hasNext();
	/**
	 * 第一个元素
	 * @return
	 */
	public Object first();
}
