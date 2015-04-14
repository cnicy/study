package me.jzz.study.gof.test.strategy;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.strategy.StrategyA;
import me.jzz.study.gof.strategy.StrategyB;
import me.jzz.study.gof.strategy.StrategyContext;

import org.testng.annotations.Test;

public class StrategyTest {
	/**
	 * 实例化不同策略，最终调用结果就不同
	 */
	@Test
	public void strategyTest(){
		StrategyContext context;
		// 第一种算法实现
		context = new StrategyContext(new StrategyA());
		assertEquals("StrategyA", context.cal());
		// 第二种算法实现
		context = new StrategyContext(new StrategyB("strategyB"));
		assertEquals("strategyB", context.cal());
	}
}
