package me.jzz.study.gof.ChainOfResposibility;

/**
 * Abstracthandler类提供了get和set方法,方便使用者设置和修改
 * 2015-4-12
 * @author rono
 */
public abstract class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
