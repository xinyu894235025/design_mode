package com.xinyu.design_mode.common.enums;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 16:10
 */
public enum ColorEnums {
    RED("red","红"),
    YELLO("yello","黄");

    private String name;
    private String desc;

    ColorEnums(String name,String desc) {
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
