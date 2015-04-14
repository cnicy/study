package me.jzz.study.gof.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者，所以观察者对象保存在一个集合里面。每个通知者都可以有任何数量的观察者
 * 2015-4-12
 * @author rono
 */
public abstract class Subject {
	List<Observer> list = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		list.add(observer);
	}
	
	public void detach(Observer observer){
		list.remove(observer);
	}
	/**
	 * 通知观察者
	 */
	public String notifyObserver(String context){
		StringBuffer sb = new StringBuffer();
		for(Observer o:list){
			String res = o.update(context);
			sb.append(res);
			sb.append("+");
		}
		String res = sb.toString();
		
		return res.substring(0, res.length()-1);
	}
}
