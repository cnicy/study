package me.jzz.study.gof.adapter;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 * 适配器测试类
 * 2015-4-2
 * @author rono
 */
public class AdapterTest {
	/**
	 * 类的适配器
	 */
	@Test 
	public void adapterClassTest(){
		Adapter adapter = new Adapter();
		
		assertEquals("original", adapter.methodA());
		assertEquals("new", adapter.methodB());
	}
	/**
	 * 对象的适配器
	 */
	@Test
	public void adapterObjectTest(){
		Sourceable target = new WrapperObject(new  Target());
		assertEquals("original", target.methodA());
		assertEquals("new", target.methodB());
	}
	/**
	 * 接口适配器
	 */
	@Test
	public void adapterInterfaceTest(){
		Sourceable source1 = new Source1();
		assertEquals("extends.methodA", source1.methodA());
		assertEquals("original.methodB", source1.methodB());
		
		Sourceable source2 = new Source2();
		assertEquals("original.methodA", source2.methodA());
		assertEquals("extends.methodB", source2.methodB());
	}
}
