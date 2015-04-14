package me.jzz.study.gof.Memento;

/**
 * 备忘录，负责存储发起人创建的对象状态，防止发起人以外的对象访问备忘录
 * 2015-4-13
 * @author rono
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
