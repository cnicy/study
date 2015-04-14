package me.jzz.study.gof.iterator;

/**
 * 具体集合类，这里用一个数组模拟
 * 2015-4-12
 * @author rono
 */
public class ConcreteCollection implements Collection{
	public String[] items = {"A","B","C","D"};

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Object get(int i) {
		return items[i];
	}

	@Override
	public int size() {
		return items.length;
	}
}
