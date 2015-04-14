package me.jzz.study.gof.test.command;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.command.Command;
import me.jzz.study.gof.command.ConcreteCommand;
import me.jzz.study.gof.command.Invoker;
import me.jzz.study.gof.command.Reciver;

import org.testng.annotations.Test;

public class CommandTest {
	@Test
	public void commandTest(){
		// 被调用者
		Reciver reciver = new Reciver();
		// 要发出的命令
		Command command = new ConcreteCommand(reciver);
		// 调用者
		Invoker invoker = new Invoker(command);
		
		assertEquals("action!", invoker.exe());
	}
}
