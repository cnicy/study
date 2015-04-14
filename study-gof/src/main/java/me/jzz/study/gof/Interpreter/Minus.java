package me.jzz.study.gof.Interpreter;

/**
 * 加法表达式  
 * 2015-4-14
 * @author rono
 */
public class Minus implements Expression{
	@Override
	public int interpret(Context context) {
		return context.getNum1()-context.getNum2();
	}
}
