package com.xinyu.design_mode.common.applet.singleton_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/20/0020 17:34
 */
public class SingletonObject {

    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return singletonObject;
    }

    public void showMessages(){
        System.out.println("I'm singleton object!");
    }
}
