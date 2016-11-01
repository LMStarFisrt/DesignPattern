package main.java.com.java.designpattrn.pattern.singleton.ex2;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Singleton3 {

    private static Singleton3 singleton3=new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        synchronized (singleton3) {
            if(singleton3==null){
                singleton3=new Singleton3();
            }
        }
        return singleton3;
    }
}
