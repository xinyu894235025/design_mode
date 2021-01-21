package com.xinyu.design_mode.common.applet.decorator_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 16:52
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        YelloShapeDecorator yelloCircle = new YelloShapeDecorator(new Circle());
        YelloShapeDecorator yelloRectangle = new YelloShapeDecorator(new Rectangle());
        Shape redCircle1 = new RedShapeDecorator(new Circle());
        Shape redRectangle2 = new RedShapeDecorator(new Rectangle());
//        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("=======================");
        redCircle.draw();
        System.out.println("=======================");
        redRectangle.draw();
        System.out.println("=======================");
        yelloCircle.draw();
        System.out.println("=======================");
        yelloRectangle.draw();

        redCircle1.draw();
        redRectangle2.draw();


    }
}
