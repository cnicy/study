package me.jzz.study.gof.test.iterator;

import me.jzz.study.gof.iterator.Collection;
import me.jzz.study.gof.iterator.ConcreteCollection;
import me.jzz.study.gof.iterator.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IteratorTest {
	@Test
	public void iteratorTest(){
		StringBuffer sb = new StringBuffer();
		Collection col = new ConcreteCollection();
		Iterator iter = col.iterator();
		while(iter.hasNext()){
			sb.append(iter.next());
		}
		Assert.assertEquals("ABCD", sb.toString());
	}
}
