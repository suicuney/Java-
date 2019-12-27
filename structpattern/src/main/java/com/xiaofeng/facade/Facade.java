package com.xiaofeng.facade;

public class Facade {
    private System1 system1 = new System1();//spring中这些都是注入的方式实现
    private System2 system2 = new System2();//
    private System3 system3 = new System3();//

    public void method(){//各种组合方式调用
        system1.method1();
        system2.method2();
        system3.method3();
    }

}
