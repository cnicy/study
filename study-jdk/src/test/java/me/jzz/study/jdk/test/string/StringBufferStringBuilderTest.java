package me.jzz.study.jdk.test.string;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StringBufferStringBuilderTest {
	@Test
	public void test(){
		StringBuffer sb = new StringBuffer();
		assertEquals(16, sb.capacity()); //  capacity() 初始化容量
		assertEquals(0, sb.length());    //  length()   有效字符序列
		sb.append("1234");   
		assertEquals(4, sb.length());   // 有效字符序列
		assertEquals("4321",sb.reverse().toString());   // reverse() 反向
		
		StringBuffer sb1 = new StringBuffer("1234");
		sb1.insert(0, "0"); //  insert() 向字符序列前面开始叠加
		assertEquals("01234",sb1.toString());
		
		StringBuilder sb2 = new StringBuilder("5");
		sb1.append(sb2); // StringBuffer、StringBuilder之间可以相互添加，因为他们都实现了CharSequence接口
		assertEquals("012345",sb1.toString());
	}
}
