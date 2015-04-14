package me.jzz.study.gof.Mediator;

public class ColleagueA extends Colleague{
	public ColleagueA(Mediator media) {
		super(media);
	}
	/**
	 * 同事A发送消息,
	 * 消息发送直接通过中介者，而不是让Colleague之间相互依赖
	 */
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		media.send(msg, this);
	}
	/**
	 * 同事A接受到消息
	 */
	@Override
	public String notifyMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("A."+msg);
		return "A."+msg;
	}
}
