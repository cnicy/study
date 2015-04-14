package me.jzz.study.gof.test.state;

import me.jzz.study.gof.state.Context;
import me.jzz.study.gof.state.StateA;

import org.testng.annotations.Test;

/**
 * 状态模式
 * 2015-4-13
 * @author rono
 */
public class StateTest {
	@Test
	public void stateTest(){
		/**
		 * 每一次请求状态都不一样
		 */
		Context c = new Context(new StateA());
		c.request();
		c.request();
		c.request();
	}
}
