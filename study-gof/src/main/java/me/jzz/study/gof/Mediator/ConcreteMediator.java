package me.jzz.study.gof.Mediator;

public class ConcreteMediator extends Mediator{
	private ColleagueA colleagueA;
	private ColleagueB colleagueB;
	
	public ConcreteMediator() {
	}

	public ConcreteMediator(ColleagueA colleagueA, ColleagueB colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
	}
	
	@Override
	public void send(String message, Colleague coll) {
		if(coll ==colleagueA)
			colleagueA.notifyMsg(message);
		else if(coll==colleagueB)
			colleagueB.notifyMsg(message);
	}

	public void setColleagueA(ColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public void setColleagueB(ColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}
}
