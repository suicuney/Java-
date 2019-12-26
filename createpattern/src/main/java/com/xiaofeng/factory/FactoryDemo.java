package com.xiaofeng.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        try {
            String factoryProperty = "com.xiaofeng.factory.Factory1";//根据配置加载类，改成Factory2则创建Product2
            AbstractFactory factory = (AbstractFactory) Class.forName(factoryProperty).newInstance();//面向接口编程
            //生产对应上面工厂的产品1
            Product1 product1 = factory.newProduct1();
            product1.show();
            //生产对应上面工厂的产品2
            Product2 product2 = factory.newProduct2();
            product2.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
