package me.jzz.study.gof.test.ChainOfResposibility;

import me.jzz.study.gof.ChainOfResposibility.ConcreteHandlerA;
import me.jzz.study.gof.ChainOfResposibility.ConcreteHandlerB;
import me.jzz.study.gof.ChainOfResposibility.ConcreteHandlerC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChainOfResposibilityTest {
	@Test
	public void test(){
		ConcreteHandlerA h1 = new ConcreteHandlerA();
		ConcreteHandlerB h2 = new ConcreteHandlerB();
		ConcreteHandlerC h3 = new ConcreteHandlerC();
		// 设置对象链
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		String res = h1.handler(2); // 由第三条链处理，那么会经过1-2 两条链Handler-A,Handler-B,Handler-C
		Assert.assertEquals("ConcreteHandlerA", res);
		
		String res1 = h1.handler(0); // 由第一条链处理，不会经过2-3条链,Handler-A
		Assert.assertEquals("ConcreteHandlerA.0", res1);
	}
}
