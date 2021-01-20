package com.xinyu.design_mode.common.applet.abstract_factory_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 16:02
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
