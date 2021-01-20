package com.xinyu.design_mode.web.controller;

import com.xinyu.design_mode.common.applet.abstract_factory_mode.AbstractFactory;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Color;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.FactoryProducer;
import com.xinyu.design_mode.common.applet.abstract_factory_mode.Shape;
import com.xinyu.design_mode.common.applet.factory_mode.impl.ShapeFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:28
 */
@RestController
@RequestMapping("/test")
public class FactoryModeController {

    @RequestMapping("/factory")
    public Object testFactory(String shapeType){
        return ShapeFactory.getShape(shapeType).draw();
    }

    @RequestMapping("/abstractFactory")
    public Object testFactory(String choice,String option){
        AbstractFactory factroy = FactoryProducer.getFactroy(choice);
        Color color = factroy.getColor(option);
        Shape shape = factroy.getShape(option);

        Map<String, String> resultMap = new HashMap<>();
        if (Objects.nonNull(color)){
            resultMap.put("color", color.fill());
        }
        if (Objects.nonNull(shape)){
            resultMap.put("shape", shape.draw());
        }
        return resultMap;
    }
}
