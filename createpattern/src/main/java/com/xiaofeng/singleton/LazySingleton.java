package com.xiaofeng.singleton;

public class LazySingleton {//懒汉式单例
    private static volatile LazySingleton instance = null; //volatiel保证线程安全
    private LazySingleton() {//构造方法为private，单例的特点，只能由自身方法创建
        System.out.println("懒汉式单例，需要使用时才生成");
    }
    public static synchronized LazySingleton getInstance(){//synchronized保证线程安全，但是效率也会降低
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void loadTest(){

    }
}
