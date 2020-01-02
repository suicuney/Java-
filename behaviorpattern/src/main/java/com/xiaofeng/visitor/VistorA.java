package com.xiaofeng.visitor;

public class VistorA implements Visitor{//具体访问者A，访问元素方法扩展不支持开闭原则
    @Override
    public void visit(ElementA elementA) {
        System.out.println("具体访问者A访问-->"+elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("具体访问者A访问-->"+elementB.operationB());
    }
}
