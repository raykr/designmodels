package com.swroom.constructor.decorator;

import java.util.List;

/**
 * 新闻加一装饰类
 * Created by jingz on 2017/2/1.
 */
public class ConcreteDecoratorAddAmount extends DecoratorNews {

    public ConcreteDecoratorAddAmount(ComponentNews componentNews) {
        super(componentNews);
    }

    /**
     * 增强方法
     * @return
     */
    public String addAmount() {
        //新闻人气加一
        System.out.println("新闻人气已经加一");
        return "新闻人气已经加一";

    }

    @Override
    public List<News> getListOfNews() {
        addAmount();
        return super.getListOfNews();
    }
}
