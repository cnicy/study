package me.jzz.study.gof.iterator;

/**
 * 集合抽象类，抽象具体迭代方法，不关心底层容器,和内部表示
 * 2015-4-12
 * @author rono
 */
public interface Collection {
	/**
	 * 元素遍历对象
	 * @return
	 */
	Iterator iterator();
	/**
	 * 获取某个元素
	 * @param i
	 * @return
	 */
	public Object get(int i);
	/**
	 * 元素集合大小
	 * @return
	 */
	public int size();
}
