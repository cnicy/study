package me.jzz.study.gof.test.flyweight;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.flyweight.FlyWeightFactory;
import me.jzz.study.gof.flyweight.UnSharedFlyWeight;

import org.testng.annotations.Test;

public class FlyWeightTest {
	@Test
	public void flyWeightTest(){
		int oper = 20; // 外部状态
		assertEquals("operation:"+20,FlyWeightFactory.getFlyWeight("oper1").operation(oper));
		assertEquals("operation:"+19,FlyWeightFactory.getFlyWeight("oper2").operation(--oper));
		assertEquals("operation:"+18,FlyWeightFactory.getFlyWeight("oper3").operation(--oper));
		
		UnSharedFlyWeight unshre = new UnSharedFlyWeight();
		assertEquals("unshre:"+17,unshre.operation(--oper));
	}
}
