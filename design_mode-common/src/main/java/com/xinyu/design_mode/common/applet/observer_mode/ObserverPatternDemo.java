package com.xinyu.design_mode.common.applet.observer_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:45
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
