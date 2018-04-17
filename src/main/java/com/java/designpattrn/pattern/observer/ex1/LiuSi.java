package com.java.designpattrn.pattern.observer.ex1;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了");
        happy(context);
        System.out.println("刘斯：乐死了");
    }

    private void happy(String reportContext) {
        System.out.println("刘斯：因为" + reportContext + "--所以我快乐");
    }
}
