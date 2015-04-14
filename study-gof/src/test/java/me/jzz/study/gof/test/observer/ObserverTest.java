package me.jzz.study.gof.test.observer;

import me.jzz.study.gof.observer.ConcreteObserver;
import me.jzz.study.gof.observer.ConcreteSubject;
import me.jzz.study.gof.observer.Subject;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ObserverTest {
	@Test
	public void observerTest(){
		String context = "context";
		Subject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("o1"));
		subject.attach(new ConcreteObserver("o2"));
		
		assertEquals("o1-context+o2-context", subject.notifyObserver(context));
	}
}
