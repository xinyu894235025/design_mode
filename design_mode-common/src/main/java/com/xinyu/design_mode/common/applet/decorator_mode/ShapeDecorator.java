package com.xinyu.design_mode.common.applet.decorator_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 16:50
 */
public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
