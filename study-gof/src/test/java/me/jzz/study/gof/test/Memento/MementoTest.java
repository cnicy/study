package me.jzz.study.gof.test.Memento;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.Memento.Originator;
import me.jzz.study.gof.Memento.Storage;

import org.testng.annotations.Test;

public class MementoTest {
	@Test
	public void mementoTest(){
		// 发起人初始状态
		Originator ori = new Originator();
		ori.setState("ON");
		// 发起人存储当前对象状态
		Storage storage = new Storage(ori.create());
		// 发起人修改了对象的状态
		ori.setState("OFF");
		assertEquals("OFF", ori.getState());
		// 返回之前的状态
		ori.restore(storage.getMenento());
		assertEquals("ON", ori.getState());
	}
}
