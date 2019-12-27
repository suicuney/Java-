package com.xiaofeng.proxy;

public class Proxy implements Subject{
    private Subject subject;

    @Override
    public void request() {
        if(subject == null){
            subject = new RealSubject();//代理中创建代理对象，或是传入
        }
        preRequest();
        subject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问之前bababa");
    }

    public void postRequest(){
        System.out.println("访问之后bababa");
    }
}
