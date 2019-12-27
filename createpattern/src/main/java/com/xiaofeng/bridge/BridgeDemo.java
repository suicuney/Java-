package com.xiaofeng.bridge;

public class BridgeDemo {//与适配器模式有点像，把适配器中的适配者进一步的抽象。虽然像，但是使用的场景不一样，适配器是一个是已经有类的适配，而桥接是
    public static void main(String[] args) {
        Implementor implementor = new ImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.Operation();
    }
}
