package com.swroom.behavior.responsibility;

/**
 * Created by jingz on 2017/1/22.
 */
public class Level {

    private int level = 0;

    public Level(int level) {
        this.level = level;
    }

    /**
     * 判断当前level和参数中level的大小
     * @param level
     * @return 当前level大，true；当前level小，false
     */
    public boolean above(Level level) {
        if (this.level >= level.level) {
            return true;
        }
        return false;
    }
}
