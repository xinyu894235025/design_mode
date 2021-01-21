package com.xinyu.design_mode.common.applet.observer_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/21/0021 14:39
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
