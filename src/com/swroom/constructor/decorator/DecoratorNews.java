package com.swroom.constructor.decorator;

import java.util.List;

/**
 * 抽象装饰类
 * Created by jingz on 2017/2/1.
 */
public abstract class DecoratorNews extends ComponentNews {

    private ComponentNews componentNews;

    public DecoratorNews(ComponentNews componentNews) {
        this.componentNews = componentNews;
    }

    @Override
    public List<News> getListOfNews() {
        return this.componentNews.getListOfNews();
    }
}
