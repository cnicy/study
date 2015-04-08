package me.jzz.study.gof.abstractfactory;

/**
 * 实例化xml的工厂
 * 2015-4-1
 * @author rono
 */
public class AbstractXmlConveterFactory implements AbstractConveterFactory{
	@Override
	public Conveter createConveter() {
		return new XmlConveter();
	}
}
