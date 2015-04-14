package me.jzz.study.gof.test.decorator;

import me.jzz.study.gof.decorator.ConcreteComponent;
import me.jzz.study.gof.decorator.ConcreteComponentA;
import me.jzz.study.gof.decorator.ConcreteComponentB;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 装饰器类测试类
 * 2015-4-6
 * @author rono
 */
public class DecoratorTest {
	@Test
	public void decorator(){
		ConcreteComponent con = new ConcreteComponent();
		ConcreteComponentA conA = new ConcreteComponentA();
		ConcreteComponentB conB = new ConcreteComponentB();
		
		conA.setComponent(con);
		conB.setComponent(conA);
		
		Assert.assertEquals(conB.operation(),"ConcreteComponentB:ConcreteComponentA:operation");
	}
}
