package com.xinyu.design_mode.common.applet.observer_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:45
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
