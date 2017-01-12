package com.swroom.singleton;

/**
 * 懒汉式单例模式
 *
 * Created by jingz on 2017/1/12.
 */
public class LazySingleton {

    /**
     * 指向自己实例的私有静态引用
     * 目的：全局可用，不被其他类实例化
     */
    private static LazySingleton singleton;

    /**
     * 私有构造方法
     * 目的：不可继承，保证唯一性
     */
    private LazySingleton() {}

    /**
     * 以自己实例为返回值的静态的公有的方法
     * 目的：提供给外部使用
     * synchronized关键字保证线程安全
     * @return singleton
     */
    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
