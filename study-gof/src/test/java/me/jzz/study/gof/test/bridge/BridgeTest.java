package me.jzz.study.gof.test.bridge;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.bridge.Bridge;
import me.jzz.study.gof.bridge.ConcreteImplementorA;
import me.jzz.study.gof.bridge.ConcreteImplementorB;
import me.jzz.study.gof.bridge.Implementor;
import me.jzz.study.gof.bridge.RealBridge;

import org.testng.annotations.Test;

public class BridgeTest {
	@Test
	public void bridgeTest(){
		// 桥接类
		Bridge bridge = new RealBridge();
		// 具体实现类A
		Implementor impleA = new ConcreteImplementorA();
		bridge.setImplementor(impleA);
		assertEquals("impleA", bridge.operation());
		// 具体实现类B
		Implementor impleB = new ConcreteImplementorB();
		bridge.setImplementor(impleB);
		assertEquals("impleB", bridge.operation());
	}
}
