package com.java.designpattrn.pattern.singleton.ex4;

/**
 * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 *
 * @author dadisdad
 * @date 2018/3/14
 */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
