package me.jzz.study.gof.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式一般跟工厂模式一起使用，用于创建和管理FlyWeight对象
 * 2015-4-12
 * @author rono
 */
public class FlyWeightFactory {
	private static Map<String,FlyWeight> flyweights = new ConcurrentHashMap<String,FlyWeight>();
	
	public static FlyWeight getFlyWeight(final String key){
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new ConcreteFlyWeight());
		}
		return flyweights.get(key);
	}
}
