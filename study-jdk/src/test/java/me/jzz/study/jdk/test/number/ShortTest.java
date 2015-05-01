package me.jzz.study.jdk.test.number;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ShortTest {
	@Test
	public void test(){
		Short s1 = 100;
		Short s2 = 100;
		Short s3 = 128;
		Short s4 = 128;
		assertEquals(true, s1==s2);  // 他们的引用相同
		assertEquals(false, s3==s4); // 他们的引用不相同
	}
}
