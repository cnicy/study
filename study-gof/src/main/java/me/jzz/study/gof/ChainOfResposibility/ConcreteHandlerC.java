package me.jzz.study.gof.ChainOfResposibility;

/**
 * 实例化后生成一系列相互持有的对象，构成一条链。
 * 2015-4-12
 * @author rono
 */
public class ConcreteHandlerC extends AbstractHandler implements Handler{
	@Override
	public String handler(int no) {
		System.out.println("Handler-C");
		if(2==no) //  判断该请求是否应该我处理,如果是我处理那么结束对象链
			return "ConcreteHandlerC.2";
		
		if(null!=getHandler()){
			getHandler().handler(no);
		}
		return "ConcreteHandlerC";
	}
}
 