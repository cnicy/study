package me.jzz.study.gof.singleton;

/**
 * 非懒加载
 * 1、线程安全
 * 2、如果构造的单例很大，构造完又迟迟不使用，会导致资源浪费。
 * 2015-4-1
 * @author rono
 */
public class UnLazySingleton {
	private static final UnLazySingleton singletonInstance = new UnLazySingleton();
	
	private UnLazySingleton(){
	}
	
	public UnLazySingleton getInstance(){
		return singletonInstance;
	}
}
