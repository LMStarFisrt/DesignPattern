package com.java.designpattrn.pattern.observer.ex1;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class LiSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报");
        report(context);
        System.out.println("李斯：汇报完毕");
    }

    private void report(String reportContext) {
        System.out.println("李斯：报告，韩非子有活动了---->" + reportContext);
    }
}
