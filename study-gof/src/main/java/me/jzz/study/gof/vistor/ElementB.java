package me.jzz.study.gof.vistor;

public class ElementB implements Element{
	@Override
	public void accept(Vistor vistor) {
		vistor.vistorElementB(this);
	}
}
