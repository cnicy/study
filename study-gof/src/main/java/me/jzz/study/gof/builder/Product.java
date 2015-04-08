package me.jzz.study.gof.builder;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 具体的产品对象，由很多个部件构成
 * 2015-4-2
 * @author rono
 */
public class Product {
	List<String> productPatrs = new CopyOnWriteArrayList<String>();
	/**
	 * 添加组件
	 * @param parts
	 */
	public void add(final String parts){
		productPatrs.add(parts);
	}
	/**
	 * 获取所有组件 
	 * @return
	 */
	public List<String> get(){
		return productPatrs;
	}
}
