package me.jzz.study.gof.Composite;

public abstract class Node {
	protected String name;
	public Node(String name){
		this.name = name;
	}
	
	public abstract void add(Node node);
	
	public abstract void remove(Node node);
	
	public abstract void display();
}
