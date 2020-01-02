package com.xiaofeng.chain;

abstract class Handler {//处理者，用组合的方式进行责任链模式设定，持有下一个处理者
    private Handler next;
    public void setHandle(Handler handle){
        this.next = handle;
    }
    public Handler getNext(){
        return this.next;
    }
    abstract void handleRequest(String request);
}
