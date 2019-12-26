package com.xiaofeng.adapter;

public class ObjectAdapter implements Target{//对象适配器
    private Adaptee adaptee;//对象适配器原理在于持有适配对象的属性

    public ObjectAdapter(Adaptee adaptee) {//构造方法
        this.adaptee = adaptee;
    }

    public void request(){
        adaptee.specificRequest();
    }
}
