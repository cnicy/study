package me.jzz.study.gof.flyweight;

/**
 * 不需要共享的FlyWeight子类
 * 2015-4-12
 * @author rono
 */
public class UnSharedFlyWeight implements FlyWeight{
	@Override
	public String operation(Integer oper) {
		return "unshre:"+oper;
	}
}
