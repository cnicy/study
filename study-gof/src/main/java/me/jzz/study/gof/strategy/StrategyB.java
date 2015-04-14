package me.jzz.study.gof.strategy;

/**
 * 策略B
 * 2015-4-12
 * @author rono
 */
public class StrategyB implements Strategy{
	private String strategy;
	public StrategyB(final String strategy){
		this.strategy = strategy;
	}
	@Override
	public String calculate() {
		return strategy;
	}
}
