package me.jzz.study.gof.adapter;

/**
 * 只重写我需要的方法
 * 2015-4-2
 * @author rono
 */
public class Source2 extends WrapperInterface{
	@Override
	public String methodB() {
		return "extends.methodB";
	}
}
