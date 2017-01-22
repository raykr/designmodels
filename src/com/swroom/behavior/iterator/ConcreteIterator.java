package com.swroom.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器实现类
 * Created by jingz on 2017/1/22.
 */
public class ConcreteIterator implements Iterator {

    private List list;  // JDK中的ListIterator是用Object[]数组实现，此例中则借用List实现
    private int cursor = 0; // 游标值

    public ConcreteIterator() {
        this.list = new ArrayList();
    }

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;

        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }

        return obj;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size())
            return false;
        return true;
    }
}
