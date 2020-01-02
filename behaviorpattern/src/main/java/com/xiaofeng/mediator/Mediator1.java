package com.xiaofeng.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator1 extends Mediator {//具体中介者，持有同事类，并进行转发
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for(Colleague ob:colleagues){
            if(!ob.equals(colleague)){
                ob.receive();
            }
        }
    }
}
