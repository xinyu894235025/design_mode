package com.xinyu.design_mode.common.applet.factory_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/4/6/0006 11:36
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");

        String draw = circle.draw();
        System.out.println(draw);

    }
}
