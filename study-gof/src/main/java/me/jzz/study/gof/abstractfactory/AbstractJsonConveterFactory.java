package me.jzz.study.gof.abstractfactory;

/**
 * 实例化json转换器的工厂
 * 2015-4-1
 * @author rono
 */
public class AbstractJsonConveterFactory implements AbstractConveterFactory{
	@Override
	public Conveter createConveter() {
		return new JsonConveter();
	}
}
