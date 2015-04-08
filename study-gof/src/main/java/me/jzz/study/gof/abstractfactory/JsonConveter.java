package me.jzz.study.gof.abstractfactory;

/**
 * Json转换器
 * 2015-4-1
 * @author rono
 */
public class JsonConveter implements Conveter{
	@Override
	public String conveter() {
		return "json";
	}
}
