package com.xinyu.design_mode.common.applet.abstract_factory_mode.impl.color;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.Color;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:25
 */
public class Red implements Color {

    @Override
    public String fill() {
        return "Fill red!";
    }

}
