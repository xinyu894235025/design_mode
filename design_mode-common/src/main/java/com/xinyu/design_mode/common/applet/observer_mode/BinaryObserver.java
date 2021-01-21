package com.xinyu.design_mode.common.applet.observer_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:40
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
