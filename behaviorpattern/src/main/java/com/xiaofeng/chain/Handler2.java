package com.xiaofeng.chain;

public class Handler2 extends Handler {//处理者实现2
    @Override
    void handleRequest(String request) {
        if(request.equals("two")){
            System.out.println("具体处理者2处理请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没人处理请求");
            }
        }
    }
}
