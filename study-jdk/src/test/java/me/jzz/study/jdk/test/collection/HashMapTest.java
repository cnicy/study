package me.jzz.study.jdk.test.collection;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HashMapTest {
	@Test
	public void test(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("key", "value");
		map.put("a", "aa");
		map.put("a1", "aa");
		map.get("");
	}
}
