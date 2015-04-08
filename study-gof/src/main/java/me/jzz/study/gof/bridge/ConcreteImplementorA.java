package me.jzz.study.gof.bridge;

/**
 * 具体实现类A
 * 2015-4-7
 * @author rono
 */
public class ConcreteImplementorA implements Implementor{
	@Override
	public String operation() {
		return "impleA";
	}
}
