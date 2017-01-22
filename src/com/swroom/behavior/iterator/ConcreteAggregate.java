package com.swroom.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类
 * 类似于jdk的Collection
 * Created by jingz on 2017/1/22.
 */
public class ConcreteAggregate implements Aggregate {

    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
