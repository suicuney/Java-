package com.xiaofeng.command;

public class CommandDemo {
    public static void main(String[] args) {//命令模式
        Command command = new Command1();//创建具体命令实现
        Invoker invoker = new Invoker(command);//调用者设置具体命令，也可以用set方法更改具体命令
        invoker.call();//命令执行
    }
}
