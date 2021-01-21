package com.xinyu.design_mode.common.applet.observer_mode;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:42
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
