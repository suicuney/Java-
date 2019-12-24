package com.myxiaofeng.base;

import java.util.Date;

public class Watch {//手表
    public Watch() {
        System.out.println("得到一个新手表！");
    }

    private String brand;

    public void setClock(){
        System.out.println("设置时钟为8：00!");
    }

    public static void showTime(){
        System.out.println("现在时间：" + new Date());
    }
}
