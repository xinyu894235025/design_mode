package com.xinyu.design_mode.common.applet.factory_mode;

import com.xinyu.design_mode.common.applet.factory_mode.impl.Circle;
import com.xinyu.design_mode.common.applet.factory_mode.impl.Square;
import com.xinyu.design_mode.common.enums.ShapeEnums;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:42
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (ShapeEnums.CIRCLE.getName().equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        if (ShapeEnums.SQUARE.getName().equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;

    }
}
