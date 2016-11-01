package main.java.com.java.designpattrn.pattern.singleton.ex1;

/**
 * 皇帝类
 * Created by dadisdad on 2016/10/31.
 */
public class Emperor {

    private static final Emperor EMPEROR=new Emperor();

    private Emperor(){

    }

    public static Emperor getInstance(){
        return EMPEROR;
    }

    public static void say(){
        System.out.println("我是秦始皇！");
    }

}
