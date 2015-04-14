package me.jzz.study.gof.test.facade;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.facade.Computer;

import org.testng.annotations.Test;

public class FacadeTest {
	@Test
	public void facadeTest(){
		Computer c = new Computer();
		assertEquals("cpu:start-disk:start-memory:start", c.start());
		assertEquals("cpu:stop-disk:stop-memory:stop", c.stop());
	}
}
