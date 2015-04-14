package me.jzz.study.gof.command;

public class ConcreteCommand implements Command{
	private Reciver reciver;
	
	public ConcreteCommand(Reciver reciver) {
		this.reciver = reciver;
	}

	@Override
	public String execute() {
		return reciver.action();
	}
}
