package me.jzz.study.gof.iterator;

/**
 * 具体迭代类，用于迭代集合类及其数据
 * 2015-4-12
 * @author rono
 */
public class ConcreteIterator implements Iterator{
	private Collection collection;
	private int pos = -1;
	
	public ConcreteIterator(Collection collection) {
		this.collection = collection;
	}

	@Override
	public Object previous() {
		if(pos>0)
			pos--;
		
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if(pos < collection.size())
			pos ++;
		
		return collection.get(pos);
	}

	@Override
	public Boolean hasNext() {
		if(pos <collection.size()-1)
			return true;
		
		return false;
	}

	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}
}
