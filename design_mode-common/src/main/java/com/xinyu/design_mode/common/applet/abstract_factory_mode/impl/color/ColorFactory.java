package com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.color;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.AbstractFactory;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Color;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Shape;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape.Circle;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape.Square;
import com.xinyu.design_mode.common.enums.ColorEnums;
import com.xinyu.design_mode.common.enums.ShapeEnums;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:42
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (StringUtils.isBlank(colorType)){
            return null;
        }
        if (ColorEnums.RED.getName().equalsIgnoreCase(colorType)){
            return new Red();
        }
        if (ColorEnums.YELLO.getName().equalsIgnoreCase(colorType)){
            return new Yello();
        }
        return null;
    }
}
