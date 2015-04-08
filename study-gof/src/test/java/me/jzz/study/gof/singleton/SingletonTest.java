package me.jzz.study.gof.singleton;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SingletonTest {
	/**
	 * 单例测试
	 */
	@Test
	public void singletonTest(){
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		// 两次初始化实例是否一致
		assertEquals(true,singleton1 == singleton2);
	}
}
