package com.xiaofeng.command;

public class Invoker {//调用者，作为客户端的接口
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令Command...");
        command.execute();
    }

}
