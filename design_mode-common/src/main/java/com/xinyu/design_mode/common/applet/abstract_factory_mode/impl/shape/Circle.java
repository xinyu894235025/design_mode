package com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.Shape;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:25
 */
public class Circle implements Shape {

    @Override
    public String draw() {
        return "I'm Circle!";
    }

}
