package me.jzz.study.gof.command;

/**
 * 命令发起者，调用者
 * 2015-4-13
 * @author rono
 */
public class Invoker {
	Command command;
	public Invoker(Command command) {
		this.command = command;
	}
	
	public String exe(){
		return command.execute();
	}
}
