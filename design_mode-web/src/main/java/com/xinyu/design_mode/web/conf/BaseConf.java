package com.xinyu.design_mode.web.conf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/19/0019 15:15
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.xinyu.design_mode.web.controller",
        "com.xinyu.design_mode.service",
        "com.xinyu.design_mode.common"
})
public class BaseConf {
}
