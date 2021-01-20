package com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.shape;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.Shape;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:26
 */
public class Square implements Shape {

    @Override
    public String draw() {
        return "I'm Square";
    }

}
