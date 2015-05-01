package me.jzz.study.jdk.test.collection;

import java.util.LinkedList;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class LinkedListTest {
	@Test
	public void test(){
		// 声明一个LinkedList
		LinkedList<String> list = new LinkedList<String>();
		String s0 = "test0";
		String s1 = "test1";
		String s2 = "test2";
		String s3 = "test3";
		
		list.add(s1); // 向链表添加第一个元素
		/**
		 * 这时候LinkedList内部的first和last都指向 s1 的引用
		 * first和last的 前驱和后继都为null
		 */
		Assert.assertEquals(list.peekFirst() == list.peekLast(), true);
		/**
		 * 添加第二个元素,这时list的first保持不变，但是last指向了s2
		 * fist 元素前驱为null，但是后继指向了 s2。last元素 的前驱指向 s1 后继为null
		 */
		list.add(s2);
		Assert.assertEquals(list.peekFirst()==s1, true);
		Assert.assertEquals(list.peekLast()==s2, true);
		/**
		 * 添加第三个元素，list的first保持不变，last指向s3
		 * fist 元素的前驱为null，后继依然指向s2。 last前驱指向s2后继为null
		 */
		list.add(s3);
		Assert.assertEquals(list.peekFirst()==s1, true);
		Assert.assertEquals(list.peekLast()==s3, true);
		/**
		 * 接着向list链表的头部添加一个元素
		 * 这时first指向s0，但是last保持不变
		 * fist 元素的前驱为null 后继为s1，last元素的前驱和后继不变，指向s2和null
		 */
		list.addFirst(s0);
		Assert.assertEquals(list.peekFirst()==s0, true);
		Assert.assertEquals(list.peekLast()==s3, true);
	}
}
