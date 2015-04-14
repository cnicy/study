package me.jzz.study.gof.strategy;

/**
 *  上下文，用于配置和维护每一个Strategy对象的引用
 * 2015-4-12
 * @author rono
 */
public class StrategyContext {
	Strategy strategy;
	/**
	 * 初始化传入具体策略对象
	 * @param strategy
	 */
	public StrategyContext(Strategy strategy){
		this.strategy = strategy;
	}
	/**
	 * 调用具体的策略算法
	 */
	public String cal(){
		return strategy.calculate();
	}
}
