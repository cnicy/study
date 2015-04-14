package me.jzz.study.gof.test.interpreter;

import me.jzz.study.gof.Interpreter.Context;
import me.jzz.study.gof.Interpreter.Minus;
import me.jzz.study.gof.Interpreter.Plus;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InterpreterTest {
	@Test
	public void test() {
		int res = new Minus().interpret(new Context(new Plus()
				.interpret(new Context(20, 10)), 20));
		// 20+10-20
		Assert.assertEquals(10, res);
	}
}
