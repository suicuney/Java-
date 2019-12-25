package com.xiaofeng.singleton;

public class HungrySingleton {//饿汉式单例模式
    private static final HungrySingleton instance = new HungrySingleton();//静态方法，加载类时候就创建了对象,因为是静态所以是线程安全
    private HungrySingleton(){//构造方法为private，单例的特点，只能由自身方法创建
        System.out.println("饿汉式单例，加载类时直接创建");
    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void loadTest(){

    }

}
