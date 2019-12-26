package com.xiaofeng.builder;

public class Product {//产品类，最后是为了得到这个想要组装的复杂产品
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show(){
        System.out.println("得到的产品展示！" + partA + partB + partC);
    }
}
