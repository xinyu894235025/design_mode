package com.xinyu.design_mode.common.enums;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:45
 */
public enum ShapeEnums {
    CIRCLE("circle","圆"),
    SQUARE("square","正方形");

    private String name;
    private String desc;

    ShapeEnums(String name,String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
