package me.jzz.study.gof.singleton;

/**
 * 线程安全的单例（懒加载）
 * 2015-4-1
 * @author rono
 */
public class ThreadSafeSingleton {
	 private static ThreadSafeSingleton instance = null;
	 
	 private ThreadSafeSingleton(){
	 }
// 第一种，线程安全，但开销大
	 /**
	  * 能保证现在安全，但是这把锁是对象级别的，每次调用getInstance 这个方法都会上锁，
	  * 但是我们的需求是，第一次初始化才加锁，所以这种方式性能太低.
	  * @return
	  */
	 public static synchronized ThreadSafeSingleton getInstance(){
		 if(null == instance){
			 instance = new ThreadSafeSingleton();
		 }
		 return instance;
	 }
// 第二种非线程安全
	 /**
	    * 　  1、线程A和线程B同时进入//1的位置。这时instance是为空的。
	  *　  2、线程A进入synchronized块，创建实例，线程B等待。
	  *	　3、线程A返回，线程B继续进入synchronized块，创建实例。。。
	  *	　4、这时已经有两个实例创建了。 
	  * @return
	  */
	 public static synchronized ThreadSafeSingleton getInstance1(){
		 if(null == instance){ // 1
			 synchronized (ThreadSafeSingleton.class) { // 静态方法只能用类字节码锁
				 instance = new ThreadSafeSingleton(); // 2
			}
		 }
		 return instance;
	 }
	 /**
	  * 双重检查加锁
	  * 问题：java平台内存模型中有一个叫“无序写”（out-of-order writes）的机制。导致双重检查加锁失败
	  * @return
	  */
// 第三种非线程安全
	 public static synchronized ThreadSafeSingleton getInstance2(){
		 if(null == instance){
			 synchronized (ThreadSafeSingleton.class) { // 静态方法只能用类字节码锁
				 if(null==instance){ // 双重检查加锁
					 /**
					  * 这行其实做了两个事情：
					  *  1、调用构造方法，创建了一个实例。
					  *  2、把这个实例赋值给instance这个实例变量
					  *  由于JVM 无序写会导致 1、2 顺序,有可能先分配空间，在初始化、或者只分配空间不初始化就退出当前线程等。
					  */
					 instance = new ThreadSafeSingleton(); 
				 }
			}
		 }
		 return instance;
	 }
// 第四种（完美式）
	 /**
	  * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
	  * 2015-4-1
	  * @author rono
	  */
	 public static class SingletonInstance{
		 private static ThreadSafeSingleton instance = new ThreadSafeSingleton();
	 }
	 
	 public static ThreadSafeSingleton getInstance3(){
		 return SingletonInstance.instance;
	 }
}
