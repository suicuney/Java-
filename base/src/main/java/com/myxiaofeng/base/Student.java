package com.myxiaofeng.base;

public class Student extends Person {//学生 泛化关系 is a
    private String studentNo;
    private Watch watch; //关联关系 属性 has a
    private Hand hand;//组合关系 整体消亡 局部也不在了
    private Leg leg;//组合关系 整体消亡 局部也不在了


    //构造方法
    public Student() {//组合关系 整体消亡 局部也不在了
        this.hand = new Hand();
        this.leg = new Leg();
        System.out.println("有手有脚的学生对象被创建了!");
    }

    public void buy(){//
        Watch watch = new Watch();//依赖关系 局部变量
        this.watch = watch;
    }

    public void setClock(Watch watch){//依赖关系 方法参数
        watch.setClock();
    }

    public void getTime(){
        Watch.showTime();//依赖关系 静态方法调用
    }


    //getter setter
    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }
}
