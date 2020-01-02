package com.xiaofeng.command;

public class Command1 implements Command {//命令接口实现类，可以持有自己信息
    private Receiver receiver;

    public Command1() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
