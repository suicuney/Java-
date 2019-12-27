package com.xiaofeng.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Component component = new Component1();//具体组件创建
        component.operation();//调用组件方法
        System.out.println("---------------");
        //与代理很像，但是要注意代理是在代理过程中创建代理对象，而装饰是已经生成好的对象
        Component component1 = new Decorator1(component);//具体组件给装饰类，注意装饰与组件实现同一接口
        component1.operation();//包含装饰方法
    }
}
