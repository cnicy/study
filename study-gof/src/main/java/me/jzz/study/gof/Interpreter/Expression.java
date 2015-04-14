package me.jzz.study.gof.Interpreter;

/**
 * 抽象表达式，声明一个抽象的解释操作
 * 2015-4-14
 * @author rono
 */
public interface Expression {
	public int interpret(Context context);  
}
