package me.jzz.study.gof.test.vistor;

import me.jzz.study.gof.vistor.ElementA;
import me.jzz.study.gof.vistor.ElementB;
import me.jzz.study.gof.vistor.ObjectStructure;
import me.jzz.study.gof.vistor.VistorA;
import me.jzz.study.gof.vistor.VistorB;

import org.testng.annotations.Test;

public class VistorTest {
	@Test
	public void test(){
		ObjectStructure os = new ObjectStructure();
		os.attach(new ElementA());
		os.attach(new ElementB());
		
		VistorA va = new VistorA();
		VistorB vb = new VistorB();
		
		os.accept(va);
		os.accept(vb);
	}
}
