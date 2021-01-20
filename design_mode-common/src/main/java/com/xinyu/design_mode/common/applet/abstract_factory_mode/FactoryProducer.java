package com.xinyu.design_mode.common.applet.abstract_factory_mode;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.color.ColorFactory;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape.ShapeFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 16:17
 */
public class FactoryProducer {

    public static AbstractFactory getFactroy(String choice){
        if (StringUtils.isBlank(choice)){
            return null;
        }
        if ("shape".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }
        if ("color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
