package me.jzz.study.gof.test.template;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.template.ConcreteA;
import me.jzz.study.gof.template.ConcreteB;
import me.jzz.study.gof.template.Template;

import org.testng.annotations.Test;

public class TemplateTest {
	@Test
	public void templateTest(){
		Template ca = new  ConcreteA();
		assertEquals("ConcreteA-operation1+ConcreteA-operation2+operation3",ca.exeTemplateMethod());
		
		Template cb = new  ConcreteB();
		assertEquals("ConcreteB-operation1+ConcreteB-operation2+operation3",cb.exeTemplateMethod());
	}
}
