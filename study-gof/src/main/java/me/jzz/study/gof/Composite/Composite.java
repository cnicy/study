package me.jzz.study.gof.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Node{
	public Composite(String name) {
		super(name);
	}

	List<Node> children = new ArrayList<Node>();
	@Override
	public void add(Node node) {
		children.add(node);
	}

	@Override
	public void remove(Node node) {
		children.remove(node);
	}

	@Override
	public void display() {
		for(Node n:children){
			System.out.println(n.name);
		}
	}
}
