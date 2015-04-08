package me.jzz.study.gof.factory;

import me.jzz.study.gof.abstractfactory.Conveter;
import me.jzz.study.gof.abstractfactory.JsonConveter;
import me.jzz.study.gof.abstractfactory.XmlConveter;

/**
 * 多工厂
 * 2015-4-1
 * @author rono
 */
public class ConveterMutilFactory {
	/**
	 * json工厂
	 * @return
	 */
	public Conveter getJsonConveter(){
		return new JsonConveter();
	}
	/**
	 * xml工厂
	 * @return
	 */
	public Conveter getXmlConveter(){
		return new XmlConveter();
	}
}
