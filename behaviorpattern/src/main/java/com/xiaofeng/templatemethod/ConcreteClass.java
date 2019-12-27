package com.xiaofeng.templatemethod;

public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("具体方法1实现被调用！");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("具体方法2实现被调用！");

    }
}
