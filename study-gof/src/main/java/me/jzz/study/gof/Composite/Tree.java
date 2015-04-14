package me.jzz.study.gof.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 典型组合模式
 * 2015-4-12
 * @author rono
 */
public class Tree {
	private String id;
	private String name;
	private Tree parent;
	private List<Tree> childrens =new ArrayList<Tree>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tree getParent() {
		return parent;
	}
	public void setParent(Tree parent) {
		this.parent = parent;
	}
	
	public void addTree(Tree tree){
		childrens.add(tree);
	}
	
	public void remove(Tree tree){
		childrens.remove(tree);
	}
}
