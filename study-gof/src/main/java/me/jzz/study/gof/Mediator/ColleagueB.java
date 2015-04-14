package me.jzz.study.gof.Mediator;

public class ColleagueB extends Colleague{
	public ColleagueB(Mediator media) {
		super(media);
	}
	/**
	 * 消息发送直接通过中介者，而不是让Colleague之间相互依赖
	 */
	@Override
	public void send(String msg) {
		media.send(msg, this);
	}

	@Override
	public String notifyMsg(String msg) {
		System.out.println("B."+msg);
		return "B."+msg;
	}
}
