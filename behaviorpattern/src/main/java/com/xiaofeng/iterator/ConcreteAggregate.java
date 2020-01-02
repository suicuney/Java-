package com.xiaofeng.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Object> objects = new ArrayList<Object>();

    @Override
    public void add(Object object) {
        objects.add(object);
    }

    @Override
    public void remove(Object object) {
        objects.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(objects);
    }
}
