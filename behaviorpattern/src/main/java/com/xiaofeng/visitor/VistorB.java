package com.xiaofeng.visitor;

public class VistorB implements Visitor {//具体访问者B，调用依赖对象元素的实际方法（访问元素方法扩展不支持开闭原则，即写死的方法）
    @Override
    public void visit(ElementA elementA) {
        System.out.println("具体访问者B访问-->"+elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("具体访问者B访问-->"+elementB.operationB());
    }
}
