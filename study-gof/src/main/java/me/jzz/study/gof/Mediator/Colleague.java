package me.jzz.study.gof.Mediator;

/**
 * Colleague类统一接口，ColleagueA和ColleagueB分别是不同的对象，二者之间有关联.
 * 如果不采用中介者模式，则需要二者相互持有引用，这样二者的耦合度很高，为了解耦， 引入了Mediator类.
 * 提供统一接口，ConcreteMediator为其实现类，里面持有ColleagueA和ColleagueB的实例，用来实现对ColleagueA和ColleagueB的控制。
 * 这样ColleagueA和ColleagueB两个对象相互独立，他们只需要保持好和Mediator之间的关系就行，
 * 剩下的全由ConcreteMediator类来维护
 * 2015-4-14
 * @author rono
 */
public abstract class Colleague {
	protected Mediator media;
	public Colleague(Mediator media) {
		this.media = media;
	}
	
	public  abstract void send(String msg);
	
	public  abstract String notifyMsg(String msg);
}
