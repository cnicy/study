package me.jzz.study.gof.test.mediator;

import me.jzz.study.gof.Mediator.ColleagueA;
import me.jzz.study.gof.Mediator.ColleagueB;
import me.jzz.study.gof.Mediator.ConcreteMediator;

import org.testng.annotations.Test;

public class MediatorTest {
	@Test
	public void test(){
		ConcreteMediator media = new ConcreteMediator();
		/**
		 * 让两个同事类认识中介者
		 */
		ColleagueA ca = new ColleagueA(media);
		ColleagueB cb = new ColleagueB(media);
		
		media.setColleagueA(ca);
		media.setColleagueB(cb);
		
		ca.send("hallo!");
		cb.send("hallo too!");
	}
}
