package me.jzz.study.gof.builder;

/**
 * A 创建产品的方式
 * 2015-4-2
 * @author rono
 */
public class BuilderA implements Builder{
	Product productA = new Product();
	@Override
	public void buildPartA() {
		productA.add("productA.partA");
	}
	@Override
	public void buildPartB() {
		productA.add("productA.partB");
	}
	@Override
	public Product builderProduct() {
		return productA;
	}
}
