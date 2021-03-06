package com.xinyu.design_mode.common.applet.decorator_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 16:51
 */
public class YelloShapeDecorator extends ShapeDecorator {

    public YelloShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border Color: Yello");
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
