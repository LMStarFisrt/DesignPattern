package main.java.com.java.designpattrn.pattern.singleton.ex1;

/**
 * Created by dadisdad on 2016/10/31.
 */
public class Minister {

    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println(emperor.hashCode());
            emperor.say();
        }
    }

}
