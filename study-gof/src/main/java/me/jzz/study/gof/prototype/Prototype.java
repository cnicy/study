package me.jzz.study.gof.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 简历实体
 * 2015-4-2
 * @author rono
 */
public class Prototype implements Cloneable,Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	private String company;
	private PrototypeReference ref;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public PrototypeReference getRef() {
		return ref;
	}
	public void setRef(PrototypeReference ref) {
		this.ref = ref;
	}
	/**
	 * 克隆方法
	 */
	public Object clone() throws CloneNotSupportedException{
		return  (Prototype) super.clone();
	}
	/**
	 * 浅复制
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object lowClone() throws CloneNotSupportedException{
		return  (Prototype) super.clone();
	}
	/**
	 * 深复制,包括对象的复制
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object deepClone() throws CloneNotSupportedException{
		Prototype prototype = (Prototype) super.clone();
		PrototypeReference refs =  (PrototypeReference) ref.clone();
		prototype.setRef(refs);
		
		return prototype;
	}
	/**
	 * 深复制，流复制 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
    public Object deepCloneByStream() throws IOException, ClassNotFoundException {  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
}
