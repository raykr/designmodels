package com.swroom.behavior.iterator;

/**
 * 迭代器接口
 * Created by jingz on 2017/1/22.
 */
public interface Iterator {

    /**
     * 获取下一个元素
     * @return obj
     */
    Object next();

    /**
     * 判断是否遍历结束
     * @return boolean
     */
    boolean hasNext();
}
