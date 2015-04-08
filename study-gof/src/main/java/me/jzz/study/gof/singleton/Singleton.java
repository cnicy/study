package me.jzz.study.gof.singleton;

/**
 * 单例
 * 懒加载、非线程安全
 * 2015-4-1
 * @author rono
 */
public final class Singleton {
	private static Singleton instance;
	// 不能实例化
	private Singleton(){
	}
	/**
	 * 本类实例全局唯一访问点
	 * @return
	 */
	public static  Singleton getInstance(){
		if(null==instance){
			instance = new Singleton();
		}
		return instance;
	}
}
