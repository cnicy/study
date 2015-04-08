package me.jzz.study.gof.abstractfactory;

/**
 * xml 转换器
 * 2015-4-1
 * @author rono
 */
public class XmlConveter implements Conveter{
	@Override
	public String conveter() {
		return "xml";
	}
}
