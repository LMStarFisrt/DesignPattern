package com.java.designpattrn.pattern.observer.ex3;


import java.util.Observable;
import java.util.Observer;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class LiuSi implements Observer {

    private void happy(String reportContext) {
        System.out.println("刘斯：因为" + reportContext + "--所以我快乐");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了");
        happy(arg.toString());
        System.out.println("刘斯：乐死了");
    }
}
