package com.xiaofeng.bridge;

public class RefinedAbstraction extends Abstraction {//具体的抽象角色，实现抽象方法，并调用持有的接口方法
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("具体抽象化实现类被访问！");
        implementor.operationImpl();
    }
}
