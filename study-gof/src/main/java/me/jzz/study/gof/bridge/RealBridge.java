package me.jzz.study.gof.bridge;

/**
 * 桥接实现类
 * 2015-4-7
 * @author rono
 */
public class RealBridge extends Bridge{
	@Override
	public String operation() {
		return impl.operation();
	}
}
