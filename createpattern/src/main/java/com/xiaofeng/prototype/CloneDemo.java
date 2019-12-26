package com.xiaofeng.prototype;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("======浅复制演示=====");
        ShallowCopyType type1 = new ShallowCopyType();
        ShallowCopyType type2 = (ShallowCopyType) type1.clone();//注意浅复制不会复制类中的引用
        System.out.println("type1==type2?" + (type1 == type2) + "\n");

        System.out.println("======深复制演示=====" );

    }
}
