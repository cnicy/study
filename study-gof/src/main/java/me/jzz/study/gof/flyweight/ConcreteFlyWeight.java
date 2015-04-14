package me.jzz.study.gof.flyweight;

public class ConcreteFlyWeight implements FlyWeight{
	@Override
	public String operation(Integer oper) {
		return "operation:"+oper;
	}
}
