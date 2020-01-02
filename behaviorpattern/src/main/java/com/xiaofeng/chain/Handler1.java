package com.xiaofeng.chain;

public class Handler1 extends Handler {//处理者实现1
    @Override
    void handleRequest(String request) {
        if(request.equals("one")){
            System.out.println("具体处理者1处理请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没人处理请求");
            }
        }
    }
}
