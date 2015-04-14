package me.jzz.study.gof.vistor;

public class ElementA implements Element{
	@Override
	public void accept(Vistor vistor) {
		vistor.vistorElementA(this);
	}
}
