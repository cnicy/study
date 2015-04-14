package me.jzz.study.gof.test.composite;

import me.jzz.study.gof.Composite.Composite;
import me.jzz.study.gof.Composite.NodeA;
import me.jzz.study.gof.Composite.NodeB;

import org.testng.annotations.Test;

public class CompositeTest {
	@Test
	public void compositeTest(){
		Composite root = new Composite("root");
		root.add(new NodeA("nodeA"));
		root.add(new NodeB("nodeB"));
		root.display();
	}
}
