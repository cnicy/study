package me.jzz.study.gof.Composite;

public class NodeB extends Node{
	public NodeB(String name) {
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
