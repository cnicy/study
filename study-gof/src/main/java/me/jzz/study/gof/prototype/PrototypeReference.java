package me.jzz.study.gof.prototype;

import java.io.Serializable;

public class PrototypeReference implements Cloneable,Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
