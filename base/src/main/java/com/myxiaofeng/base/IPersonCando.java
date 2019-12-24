package com.myxiaofeng.base;

public interface IPersonCando {//人class的做事接口
    void buy();//实现为 依赖关系 创建手表对象（依赖）
    void setClock(Watch watch);//依赖手表类，作为方法参数
    void getTime();//依赖关系 调用手表静态方法
}
