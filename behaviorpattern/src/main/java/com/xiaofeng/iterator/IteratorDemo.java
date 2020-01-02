package com.xiaofeng.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        ca.add("清华大学");
        ca.add("北京大学");
        ca.add("人民大学");
        System.out.println("聚合的内容有：");
        Iterator iterator = ca.getIterator();
        while (iterator.hasNext()){
            Object ob = iterator.next();
            System.out.println(ob.toString()+"\t");
        }
        Object ob = iterator.first();
        System.out.println("\nFirst:" + ob.toString());
    }
}
