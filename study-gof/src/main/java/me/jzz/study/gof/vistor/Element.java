package me.jzz.study.gof.vistor;

/**
 * 定义一个accept操作，以访问者为参数
 * 2015-4-13
 * @author rono
 */
public interface Element {
	public void accept(Vistor vistor);
}
