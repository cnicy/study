package me.jzz.study.gof.prototype;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PrototypeTest {
	@Test
	public void prototypeTest(){
		try {
			Prototype p1 = new Prototype();
			p1.setAge(18);
			p1.setCompany("company");
			p1.setName("jack");
			
			Prototype p2 = (Prototype) p1.clone();
			p2.setAge(20);
			
			assertEquals("company", p2.getCompany());
			assertEquals(true,20 == p2.getAge());
			assertEquals("jack", p2.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 浅复制
	 */
	@Test
	public void prototypeLowClone(){
		try {
			Prototype p1 = new Prototype();
			p1.setAge(18);
			p1.setCompany("company");
			p1.setName("jack");
			// 引用对象
			PrototypeReference ref = new PrototypeReference();
			ref.setId(10L);
			ref.setName("jack");
			p1.setRef(ref);
			
			Prototype p2 = (Prototype) p1.lowClone();
			// 更改原来的reference会对当前对象引用造成影响
			ref.setId(20L);
			ref.setName("jack");
			
			assertEquals("jack", p2.getName());
			assertEquals("company", p2.getCompany());
			assertEquals(true, 20 ==p2.getRef().getId()); // 值还是原来的引用的对象
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 深度复制
	 */
	@Test
	public void prototypeDeepClone(){
		try {
			Prototype p1 = new Prototype();
			p1.setAge(18);
			p1.setCompany("company");
			p1.setName("jack");
			// 引用对象
			PrototypeReference ref = new PrototypeReference();
			ref.setId(10L);
			ref.setName("jack");
			p1.setRef(ref);
			
			Prototype p2 = (Prototype) p1.deepClone();
			// 更改原来的reference会对当前对象引用造成影响
			ref.setId(20L);
			ref.setName("jack");
			
			assertEquals("jack", p2.getName());
			assertEquals("company", p2.getCompany());
			assertEquals(true, 10 ==p2.getRef().getId()); // 值还是原来的引用的对象
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 深度复制,采用流的方式复制
	 */
	@Test
	public void prototypeDeepCloneByStream(){
		try {
			Prototype p1 = new Prototype();
			p1.setAge(18);
			p1.setCompany("company");
			p1.setName("jack");
			// 引用对象
			PrototypeReference ref = new PrototypeReference();
			ref.setId(10L);
			ref.setName("jack");
			p1.setRef(ref);
			
			Prototype p2 = (Prototype) p1.deepCloneByStream();
			// 更改原来的reference会对当前对象引用造成影响
			ref.setId(20L);
			ref.setName("jack");
			
			assertEquals("jack", p2.getName());
			assertEquals("company", p2.getCompany());
			assertEquals(true, 10 ==p2.getRef().getId()); // 值还是原来的引用的对象
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
