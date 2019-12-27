package com.xiaofeng.templatemethod;

public class TempaltemethodDemo {//模板方法设计模式
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();//创建具体的实现，面向抽象调用
        abstractClass.templateMethod();
    }
}
