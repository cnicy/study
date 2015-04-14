package me.jzz.study.gof.test.factory.test;

import static org.testng.Assert.assertEquals;
import me.jzz.study.gof.abstractfactory.AbstractConveterFactory;
import me.jzz.study.gof.abstractfactory.AbstractJsonConveterFactory;
import me.jzz.study.gof.abstractfactory.AbstractXmlConveterFactory;
import me.jzz.study.gof.abstractfactory.Conveter;
import me.jzz.study.gof.factory.ConveterMutilFactory;
import me.jzz.study.gof.factory.ConveterSimpleFactory;
import me.jzz.study.gof.factory.ConveterStaticFactory;

import org.testng.annotations.Test;

public class ConveterFactoryTest {
	/**
	 * 简单工厂测试
	 */
	@Test
	public void simpleFactoryTest() {
		// json转换器
		Conveter jsonConveter = new ConveterSimpleFactory().getConveter("json");
		assertEquals("json", jsonConveter.conveter());
		// xml转换器
		Conveter xmlConveter = new ConveterSimpleFactory().getConveter("xml");
		assertEquals("xml", xmlConveter.conveter());
	}

	/**
	 * 多工厂
	 */
	@Test
	public void mutilFactory() {
		// json 转换
		Conveter jsonConveter = new ConveterMutilFactory().getJsonConveter();
		assertEquals("json", jsonConveter.conveter());
		// xml 转换
		Conveter xmlConveter = new ConveterMutilFactory().getXmlConveter();
		assertEquals("xml", xmlConveter.conveter());
	}

	/**
	 * 静态工厂
	 */
	@Test
	public void staticFactory() {
		// json 转换
		Conveter jsonConveter = ConveterStaticFactory.getJsonConveter();
		assertEquals("json", jsonConveter.conveter());
		// xml 转换
		Conveter xmlConveter = ConveterStaticFactory.getXmlConveter();
		assertEquals("xml", xmlConveter.conveter());
	}

	/**
	 * 抽象工厂
	 */
	@Test
	public void abstractFactoryTest() {
		// json转换工厂
		AbstractConveterFactory jsonConveterFactory = new AbstractJsonConveterFactory();
		// json转换器
		Conveter jsonConveter = jsonConveterFactory.createConveter();
		assertEquals("json", jsonConveter.conveter());
		// xml转换工厂
		AbstractConveterFactory xmlConveterFactory = new AbstractXmlConveterFactory();
		// xml转换器
		Conveter xmlconveConveter = xmlConveterFactory.createConveter();
		assertEquals("xml", xmlconveConveter.conveter());
	}
}
