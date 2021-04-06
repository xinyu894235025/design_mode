package com.xinyu.design_mode.common.applet.decorator_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 16:53
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
