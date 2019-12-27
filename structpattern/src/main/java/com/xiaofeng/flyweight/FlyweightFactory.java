package com.xiaofeng.flyweight;

import java.util.HashMap;

public class FlyweightFactory {//享元工厂，用于获取享元信息，面向接口编程
    private HashMap<String,Flyweight> flyweights = new HashMap<String,Flyweight>();
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        //有则返回，无则创建共享享元
        if(flyweight!=null){
            System.out.println("具体享元"+key+"已经存在，已被成功获取！");
        }else{
            flyweight = new Flywight1(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}
