package com.xiaofeng.singleton;

public class SingletonDemo {
    public static void main(String[] args){

        //懒汉式单例 加载类模拟，没有创建类
        LazySingleton.loadTest();
        //饿汉式 加载类模拟，直接创建类 所以先打印控制台
        HungrySingleton.loadTest();

        //懒汉式真正使用才加载
        LazySingleton lazySingleton = LazySingleton.getInstance();
        //饿汉式直接返回已经生成的类
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        //再创建一次，都不再调用构造方法，为单例。
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
    }
}
