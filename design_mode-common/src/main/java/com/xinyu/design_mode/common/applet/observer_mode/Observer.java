package com.xinyu.design_mode.common.applet.observer_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:40
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
