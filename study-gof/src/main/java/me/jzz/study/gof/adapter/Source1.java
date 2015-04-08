package me.jzz.study.gof.adapter;

/**
 * 之重写我需要的方法
 * 2015-4-2
 * @author rono
 */
public class Source1 extends WrapperInterface{
	@Override
	public String methodA() {
		return "extends.methodA";
	}
}
