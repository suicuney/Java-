package com.xiaofeng.chain;

public class ChainDemo {//责任链 先进行组装处理方式，然后进行传递直到被处理
    public static void main(String[] args) {
        //组装处理者
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        handler1.setHandle(handler2);
        //提交请求
        handler1.handleRequest("two");//客户端只要提交请求，具体实现由处理者实现完成
    }
}
