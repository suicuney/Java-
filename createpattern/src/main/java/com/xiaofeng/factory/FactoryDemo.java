package com.xiaofeng.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        try {
            String factoryProperty = "com.xiaofeng.factory.Factory1";//根据配置加载类，改成Factory2则创建Product2
            AbstractFactory factory = (AbstractFactory) Class.forName(factoryProperty).newInstance();//面向接口编程
            Product product = factory.newProduct();
            product.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
