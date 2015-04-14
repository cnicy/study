package me.jzz.study.gof.vistor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> elements = new ArrayList<Element>();
	
	public void attach(Element element){
		this.elements.add(element);
	}
	public void detach(Element element){
		this.elements.remove(element);
	}
	
	public void accept(Vistor vistor){
		for(Element e:elements){
			e.accept(vistor);
		}
	}
}
