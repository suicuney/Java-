package com.xiaofeng.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        Composite c1 = new Composite();//c1为根节点，下面有一个节点和一个树叶1
        Composite c2 = new Composite();//c2为根节点下的节点，下面有两个树叶23
        c1.add(leaf1);
        c1.add(c2);
        c2.add(leaf2);
        c2.add(leaf3);
        c1.operation();
    }
}
