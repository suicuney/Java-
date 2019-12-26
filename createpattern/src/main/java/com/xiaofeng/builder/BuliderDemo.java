package com.xiaofeng.builder;

public class BuliderDemo {//客户端类，演示建造者模式

    public static void main(String[] args) {
        Builder builder = new Builder1();//具体建造者实现
        Director director = new Director(builder);//指挥者指定具体的建造者，依据抽象开发
        Product product = director.construct();//指挥者建造得到具体产品
        product.show();//产品展示
    }

}
