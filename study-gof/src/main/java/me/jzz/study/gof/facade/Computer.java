package me.jzz.study.gof.facade;

/**
 * 门面类
 * 2015-4-6
 * @author rono
 */
public class Computer {
	CPU cpu;
	Disk disk;
	Memory memory;
	
	
	public Computer() {
		this.cpu = new CPU();
		this.disk = new Disk();
		this.memory = new Memory();
	}
	public String start(){
		return cpu.start()+"-"+disk.start()+"-"+memory.start();
	}
	public String stop(){
		return cpu.stop()+"-"+disk.stop()+"-"+memory.stop();
	}
}
