package me.jzz.study.gof.bridge;

/**
 * 桥接类
 * 2015-4-7
 * @author rono
 */
public abstract class Bridge {
	protected Implementor impl;
	
	public void setImplementor(Implementor impl){
		this.impl = impl;
	}
	
	public abstract String operation();
}
