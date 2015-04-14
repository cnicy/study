package me.jzz.study.gof.ChainOfResposibility;

/**
 * 实例化后生成一系列相互持有的对象，构成一条链。
 * 2015-4-12
 * @author rono
 */
public class ConcreteHandlerA extends AbstractHandler implements Handler{
	@Override
	public String handler(int no) {
		System.out.println("Handler-A");
		if(no==0){ // // 判断该请求是否应该我处理,如果是我处理那么结束对象链
			return "ConcreteHandlerA.0";
		}
		if(null!=getHandler()){
			getHandler().handler(no);
		}
		return "ConcreteHandlerA";
	}
}
