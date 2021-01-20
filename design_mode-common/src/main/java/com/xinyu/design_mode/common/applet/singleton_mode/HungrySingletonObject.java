package com.xinyu.design_mode.common.applet.singleton_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/20/0020 18:30
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
