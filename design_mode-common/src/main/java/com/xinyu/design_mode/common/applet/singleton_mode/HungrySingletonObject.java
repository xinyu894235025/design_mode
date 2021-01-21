package com.xinyu.design_mode.common.applet.singleton_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/20/0020 18:30
 * @desc 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
 * 虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定
 * 有其他的方式（或者其他的静态方法）导致类加载，这时候初始化 instance 显然没有达到
 * lazy loading 的效果。
 */
public class HungrySingletonObject {

    private static HungrySingletonObject hungrySingletonObject = new HungrySingletonObject();

    private HungrySingletonObject() {
    }

    public static HungrySingletonObject getInstance() {
        return hungrySingletonObject;
    }
    public void showMessages(){
        System.out.println("I'm singleton object!");
    }

}
