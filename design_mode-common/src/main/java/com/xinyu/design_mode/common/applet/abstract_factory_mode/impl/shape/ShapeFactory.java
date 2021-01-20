package com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.AbstractFactory;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Color;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Shape;
import com.xinyu.design_mode.common.enums.ShapeEnums;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:42
 */
@Component
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (StringUtils.isBlank(shapeType)) {
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
