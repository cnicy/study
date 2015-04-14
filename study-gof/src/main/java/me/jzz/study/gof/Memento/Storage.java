package me.jzz.study.gof.Memento;

/**
 * 备忘录管理者，负责存储备忘录状态,但是不能对备忘录内容进行操作
 * 2015-4-13
 * @author rono
 */
public class Storage {
	private Memento menento;

	public Storage(Memento menento) {
		this.menento = menento;
	}

	public Memento getMenento() {
		return menento;
	}

	public void setMenento(Memento menento) {
		this.menento = menento;
	}
}
