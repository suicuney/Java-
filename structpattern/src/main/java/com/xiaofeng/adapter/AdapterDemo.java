package com.xiaofeng.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("===类适配器实例===");
        Target target = new ClassAdapter();//创建类适配器的对象，通过抽象接口调用,因为是继承所以实际就是适配者本身
        target.request();
        System.out.println("\n===对象适配器实例===");
        Adaptee adaptee = new Adaptee();//创建要适配者的对象
        Target target1 = new ObjectAdapter(adaptee);//适配Target接口
        target1.request();
    }
}
