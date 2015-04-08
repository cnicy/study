package me.jzz.study.gof.factory;

import me.jzz.study.gof.abstractfactory.Conveter;
import me.jzz.study.gof.abstractfactory.JsonConveter;
import me.jzz.study.gof.abstractfactory.XmlConveter;

/**
 * 单个工厂 2015-4-1
 * 
 * @author rono
 */
public class ConveterSimpleFactory {
	/**
	 * 根据传入不同参数返回不同实例
	 * @param type
	 * @return
	 */
	public Conveter getConveter(final String type) {
		Conveter conveter=null;
		switch (type) {
		case "json":
			conveter = new  JsonConveter();
			break;
		case "xml":
			conveter = new  XmlConveter();
			break;
		}
		return conveter;
	}
}
