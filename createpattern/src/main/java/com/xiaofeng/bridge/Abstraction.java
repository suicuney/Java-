package com.xiaofeng.bridge;

public abstract class Abstraction {//抽象的角色，持有实现接口，并定义角色应有的抽象方法
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void Operation();
}
