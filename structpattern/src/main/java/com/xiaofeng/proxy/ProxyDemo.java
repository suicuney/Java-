package com.xiaofeng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("===静态代理===");
        Proxy proxy = new Proxy();//代理类创建后调用方法
        proxy.request();//实际是创建代理对象，然后进行代理对象的调用

        System.out.println("\n===动态代理===");
        RealSubject realSubject = new RealSubject();//要代理的类，需要实现接口
        Subject proxyD = (Subject) java.lang.reflect.Proxy.newProxyInstance(//jdk动态代理写法,获得代理类，代理内容如下
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                (Object proxy1, Method method, Object[] args1) -> {//lambada写法，具体代理内容
                    System.out.println("pre method bababa");
                    method.invoke(realSubject, args1);
                    System.out.println("post method bababa");
                    return null;
                }

        );
        proxyD.request();//代理类请求
    }
}
