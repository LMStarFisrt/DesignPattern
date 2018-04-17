package com.java.designpattrn.pattern.observer.ex3;


import java.util.Observable;
import java.util.Observer;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class LiSi implements Observer {

    private void report(String reportContext) {
        System.out.println("李斯：报告，韩非子有活动了---->" + reportContext);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报");
        report(arg.toString());
        System.out.println("李斯：汇报完毕");
    }
}
