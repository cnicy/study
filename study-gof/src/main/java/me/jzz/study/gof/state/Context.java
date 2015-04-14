package me.jzz.study.gof.state;

/**
 * 维护状态对象实例，这个实例定义当前对象的状态
 * 2015-4-13
 * @author rono
 */
public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}
	/**
	 * 对请求进行处理，并进行下一个操作
	 */
	public void request(){
		state.handler(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
