package me.jzz.study.gof.adapter;

/**
 * 面向对象的适配器
 * 核心思想：将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 * 2015-4-2
 * @author rono
 */
public class WrapperObject implements Sourceable{
	private Target source;
	
	public WrapperObject(Target source){
		this.source = source;
	}

	@Override
	public String methodA() {
		return source.methodA();
	}

	@Override
	public String methodB() {
		return "new";
	}
}
