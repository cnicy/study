package me.jzz.study.gof.facade;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class FacadeTest {
	@Test
	public void facadeTest(){
		Computer c = new Computer();
		assertEquals("cpu:start-disk:start-memory:start", c.start());
		assertEquals("cpu:stop-disk:stop-memory:stop", c.stop());
	}
}
