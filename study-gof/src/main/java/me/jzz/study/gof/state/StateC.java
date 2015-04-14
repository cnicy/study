package me.jzz.study.gof.state;

public class StateC implements State{
	@Override
	public void handler(Context context) {
		System.out.println("状态C");
		context.setState(new StateA());
	}
}
