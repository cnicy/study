package me.jzz.study.jdk.test.string;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class StringTest{
	@Test
	public void test(){
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "a"+"b"+"c";
		String str4 = new String("abc");
		String str5 = "ab";
		String compare = "abc";
		
		assertEquals(true,str1==str2);   // str1，str2两个对象地址都指向常量池
		assertEquals(true,str1=="abc");  // 内容相同
		assertEquals(true,str3=="abc");  // "a"+"b"+"c" 都是常量相加，jvm会优化成“abc”然后存到常量池
		assertEquals(false,compare==(str5+"c"));  // str5 是变量，不会被优化
		assertEquals(false,str4==compare); // compare 地址在常量池，str4地址在堆
		assertEquals(true,str4.intern()==compare);  // intern()方法时返回的是池中”abc”对象引用
		assertEquals(true,str4.equals(compare));  // String 重写了equals方法，会按逐个比较
		assertEquals(true,str1.hashCode() == str2.hashCode());  // hashCode()方法是返回字符串内容的哈希码，既然内容相同，哈希码必然相同
	}
	
	@Test
	public void test1(){
		char[] c = new char[4];
		c[0] = '\uD800';
		c[1] = '\uDC00';
		assertEquals(65536, new String(c).codePointAt(0)); // 返回字符串s的unicode编码
		assertEquals(56320, new String(c).codePointAt(1)); // 返回字符串s的unicode编码
	}
}
