package me.jzz.study.gof.Interpreter;

/**
 * 包含解释器之外的全部信息,包括要操作的数据
 * 2015-4-14
 * @author rono
 */
public class Context {
    private int num1;  
    private int num2;  
      
    public Context(int num1, int num2) {  
        this.num1 = num1;  
        this.num2 = num2;  
    }  
      
    public int getNum1() {  
        return num1;  
    }  
    public void setNum1(int num1) {  
        this.num1 = num1;  
    }  
    public int getNum2() {  
        return num2;  
    }  
    public void setNum2(int num2) {  
        this.num2 = num2;  
    } 
}
