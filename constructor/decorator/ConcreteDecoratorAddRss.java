package com.swroom.constructor.decorator;

import java.util.List;

/**
 * 加入到Rss方法类
 * Created by jingz on 2017/2/1.
 */
public class ConcreteDecoratorAddRss extends DecoratorNews {

    public ConcreteDecoratorAddRss(ComponentNews componentNews) {
        super(componentNews);
    }

    public String addRss() {
        System.out.println("新闻标题已经加入到RSS中");
        return "";
    }

    @Override
    public List<News> getListOfNews() {
        addRss();
        return super.getListOfNews();
    }
}
