package com.java.designpattrn.pattern.observer.ex3;


import java.util.Observable;
import java.util.Observer;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class WangSi implements Observer {

    private void cry(String reportContext) {
        System.out.println("王斯：因为" + reportContext + "---所以我悲伤");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动");
        cry(arg.toString());
        System.out.println("王斯：哭死了");
    }
}
