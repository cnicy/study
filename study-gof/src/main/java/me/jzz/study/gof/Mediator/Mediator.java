package me.jzz.study.gof.Mediator;

/**
 * 中介者类，为Subject类和子类之间相互依赖解耦
 * 2015-4-14
 * @author rono
 */
public abstract class Mediator {
	public abstract void send(String message,Colleague coll);
}
