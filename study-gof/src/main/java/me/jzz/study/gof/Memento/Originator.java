package me.jzz.study.gof.Memento;

/**
 * 发起人,负责创建备忘信息和记录当前内部状态
 * 2015-4-13
 * @author rono
 */
public class Originator {
	private String state;
	
	public Memento create(){
		return new Memento(state);
	}
	
	public void restore(Memento memento){
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
