package com.swroom.constructor.decorator;

import java.util.List;

/**
 * 抽象新闻发布类
 * Created by jingz on 2017/2/1.
 */
public abstract class ComponentNews {

    /**
     * 获取新闻列表
     * @return
     */
    public abstract List<News> getListOfNews();
}
