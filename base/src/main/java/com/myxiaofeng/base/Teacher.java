package com.myxiaofeng.base;

public class Teacher extends Person implements IPersonCando {//学生继承人 泛化关系 is a； 实现 做事 接口
    private Watch watch; //关联关系 属性 has a
    private Hand hand;//组合关系 整体消亡 局部也不在了
    private Leg leg;//组合关系 整体消亡 局部也不在了


    //构造方法
    public Teacher(String name, Integer age) {//组合关系 整体消亡 局部也不在了
        super(name,age);
        this.hand = new Hand();
        this.leg = new Leg();
        System.out.println("有手有脚的老师对象创建成功！" + "名字：" + name + " 年龄:" + age);
    }

    public void buy(){
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

    public void sayHello(){
        System.out.println("teacher say hello");
    }
}
