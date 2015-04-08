package me.jzz.study.gof.builder;

/**
 * 创建Product的各个部分抽象类
 * 2015-4-2
 * @author rono
 */
public interface Builder {
	/**
	 * 创建A对象
	 */
	void buildPartA();
	/**
	 * 创建B对象
	 */
	void buildPartB();
	/**
	 * 创建一个具体的产品对象
	 * @return
	 */
	Product builderProduct();
}
