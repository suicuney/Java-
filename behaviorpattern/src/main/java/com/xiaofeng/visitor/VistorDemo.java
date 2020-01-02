package com.xiaofeng.visitor;

public class VistorDemo {//访问者模式，行为型模式中最复杂的一种
    public static void main(String[] args) {
        Structure structure = new Structure();//创建结构，持有元素，依赖访问者
        structure.add(new ElementA());//添加元素A
        structure.add(new ElementB());//添加元素B
        Visitor visitor = new VistorA();//创建具体访问者A
        structure.accept(visitor);//通过结构访问元素，传入具体实现访问者A
        System.out.println("----------------");
        visitor = new VistorB();//创建具体访问者B
        structure.accept(visitor);//通过结构访问元素，传入具体实现访问者A
    }
}
