package com.swroom.constructor.decorator;

/**
 * 客户端测试类
 * Created by jingz on 2017/2/1.
 */
public class Client {
    public static void main(String[] args) {
        // 数据库方式获取新闻
        ComponentNews component = new DBNews();
        // 扩展了展示新闻标题的同时增加新闻人气的方法
        DecoratorNews decorator = new ConcreteDecoratorAddAmount(component);
        decorator.getListOfNews();
        // 扩展了展示新闻标题的同时加入RSS
        decorator = new ConcreteDecoratorAddRss(component);
        decorator.getListOfNews();
    }
}
