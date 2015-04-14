package me.jzz.study.gof.vistor;

public class VistorA implements Vistor{
	@Override
	public void vistorElementA(ElementA element) {
		System.out.println(this.getClass().getName()+"-"+element.getClass().getName());
	}

	@Override
	public void vistorElementB(ElementB element) {
		System.out.println(this.getClass().getName()+"-"+element.getClass().getName());
	}
}
