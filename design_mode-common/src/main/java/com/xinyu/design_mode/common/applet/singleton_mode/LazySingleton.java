package com.xinyu.design_mode.common.applet.singleton_mode;

import java.util.Objects;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/20/0020 17:40
 * @desc 懒加载单例模式（懒汉式）
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * 线程安全只需要在方法体上加入 synchronized 关键字，但是会影响效率
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private int a = 0;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public synchronized int getA() {
        return a;
    }

    public synchronized void setA(int a) {
        this.a = this.a + a;
    }

    public void showMessages() {
        System.out.println("I'm lazySingleton object!");
    }
}
