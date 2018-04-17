package com.java.designpattrn.pattern.observer.ex1;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class WangSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动");
        cry(context);
        System.out.println("王斯：哭死了");
    }

    private void cry(String reportContext) {
        System.out.println("王斯：因为" + reportContext + "---所以我悲伤");
    }
}
