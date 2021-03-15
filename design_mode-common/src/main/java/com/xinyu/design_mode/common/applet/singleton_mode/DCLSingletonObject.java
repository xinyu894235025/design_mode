package com.xinyu.design_mode.common.applet.singleton_mode;

import java.util.Objects;

/**
 * @Author xinyu4
 * @Date 2021/1/21/0021 11:10
 * @Description double-checked locking (双检锁/双重校验锁)
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class DCLSingletonObject {

    private static volatile DCLSingletonObject INSTANCE;

    private DCLSingletonObject() {
    }

    public static DCLSingletonObject getInstance(){
        //外部校验，减少锁资源的获取频率
        if (Objects.isNull(INSTANCE)){
            //加锁，保证线程安全
            synchronized (DCLSingletonObject.class){
                //第二次校验，防止第二次创建对象
                if (Objects.isNull(INSTANCE)){
                    INSTANCE = new DCLSingletonObject();
                }
            }
        }
        return INSTANCE;
    }
}
