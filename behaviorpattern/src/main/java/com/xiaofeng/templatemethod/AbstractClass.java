package com.xiaofeng.templatemethod;

public abstract class AbstractClass {//抽象模板类，面向抽象编程，定义了自己和抽象的模板方法用于被客户端调用
    public void templateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
    public void specificMethod(){
        System.out.println("抽象类中的具体方法被调用！");//可以理解为模板共有的方法
    }

}
