package com.xinyu.design_mode.common.applet.singleton_mode;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author xinyu4
 * @Date 2021/1/20/0020 17:37
 */
public class TestSingleton {

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(3,
            3,
            10,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(10)
    );

    public static void main(String[] args) {
        LazySingletonObject lazyInstance = LazySingletonObject.getInstance();
        long a = System.currentTimeMillis();
        executor.execute(() -> {
            for (int i = 0; i < 50; i++) {
                lazyInstance.setA(1);
            }
            System.out.println(Thread.currentThread().getName());
        });
        executor.execute(() -> {
            for (int i = 0; i < 50; i++) {
                lazyInstance.setA(1);
            }
            System.out.println(Thread.currentThread().getName());
        });
        executor.execute(() -> {
            LazySingletonObject instance = LazySingletonObject.getInstance();
            System.out.println(instance.getA());
        });
        long b = System.currentTimeMillis();
        System.out.println((b-a) + "ms");
        executor.shutdown();
    }
}
