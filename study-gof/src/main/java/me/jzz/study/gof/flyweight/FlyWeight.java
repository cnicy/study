package me.jzz.study.gof.flyweight;

/**
 * 享元模式，所有享元类的超类或接口，通过这个类FlyWeight可以作用并用于外部状态
 * 2015-4-12
 * @author rono
 */
public interface FlyWeight {
	public String operation(Integer oper);
}
