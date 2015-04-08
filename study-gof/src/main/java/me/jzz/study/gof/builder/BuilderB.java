package me.jzz.study.gof.builder;

/**
 * B 创建产品的方式
 * 2015-4-2
 * @author rono
 */
public class BuilderB implements Builder{
	Product productB = new Product();
	@Override
	public void buildPartA() {
		productB.add("productB.partA");
	}
	@Override
	public void buildPartB() {
		productB.add("productB.partB");
	}
	@Override
	public Product builderProduct() {
		return productB;
	}
}
