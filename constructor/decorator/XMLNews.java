package com.swroom.constructor.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 基于XML获取新闻
 * Created by jingz on 2017/2/1.
 */
public class XMLNews extends ComponentNews {

    @Override
    public List<News> getListOfNews() {
        List<News> list = new ArrayList<>();
        System.out.println("从XML中获取新闻填充到list中");
        return list;
    }
}
