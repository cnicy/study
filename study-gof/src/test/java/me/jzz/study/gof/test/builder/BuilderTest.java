package me.jzz.study.gof.test.builder;

import static org.testng.Assert.assertEquals;
import java.util.List;

import me.jzz.study.gof.builder.Builder;
import me.jzz.study.gof.builder.BuilderA;
import me.jzz.study.gof.builder.BuilderB;
import me.jzz.study.gof.builder.Director;
import me.jzz.study.gof.builder.Product;

import org.testng.annotations.Test;

public class BuilderTest {
	@Test
	public void builderTest(){
		Director director = new Director();
		// 要创建哪个产品
		Builder builderA = new BuilderA();
		// 有了构造器，传入参数进行创建
		director.create(builderA);
		// 创建完成，获取创建结果
		Product productA = builderA.builderProduct();
		
		List<String> list = productA.get();
		assertEquals("productA.partA", list.get(0));
		assertEquals("productA.partB", list.get(1));
		
		
		Builder builderB = new BuilderB();
		director.create(builderB);
		Product productB = builderB.builderProduct();
		
		List<String> list1 = productB.get();
		assertEquals("productB.partA", list1.get(0));
		assertEquals("productB.partB", list1.get(1));
	}
}
