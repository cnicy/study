package me.jzz.study.gof.abstractfactory;

/**
 * 为了解决工厂模式中，switch分支和工厂类耦合的问题，现根据依赖倒转原则把工厂类也抽象成一个接口。
 * 2015-4-1
 * @author rono
 */
public interface AbstractConveterFactory {
	Conveter createConveter();
}
