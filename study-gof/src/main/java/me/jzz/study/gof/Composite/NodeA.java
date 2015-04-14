package me.jzz.study.gof.Composite;

public class NodeA extends Node{
	public NodeA(String name) {
		super(name);
	}

	@Override
	public void add(Node node) {
	}

	@Override
	public void remove(Node node) {
	}

	@Override
	public void display() {
		System.out.println(name);
	}
}
