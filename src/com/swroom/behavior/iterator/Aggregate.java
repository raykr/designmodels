package com.swroom.behavior.iterator;

/**
 * 抽象容器
 * 类似于jdk的Iterable
 * Created by jingz on 2017/1/22.
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    /**
     * 迭代方法
     * @return 迭代器对象
     */
    Iterator iterator();

}
