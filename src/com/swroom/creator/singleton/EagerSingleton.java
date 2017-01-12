package com.swroom.creator.singleton;

/**
 * 饿汉式单例模式
 *
 * Created by jingz on 2017/1/12.
 */
public class EagerSingleton {

    /**
     * 指向自己实例的私有静态引用
     * 目的：全局可用，不被其他类实例化
     */
    private static EagerSingleton singleton = new EagerSingleton();

    /**
     * 私有构造方法
     * 目的：不可继承，保证唯一性
     */
    private EagerSingleton() {}

    /**
     * 以自己实例为返回值的静态的公有的方法
     * 目的：提供给外部使用
     * @return singleton
     */
    public static EagerSingleton getInstance() {
        return singleton;
    }
}
