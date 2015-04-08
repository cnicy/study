package me.jzz.study.gof.builder;

/**
 * 指挥者，根据用户需求创建具体的Product
 * 2015-4-2
 * @author rono
 */
public class Director {
	/**
	 * 传入不同的实现，创建出不同的实例
	 * @param builder
	 */
	public void create(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
