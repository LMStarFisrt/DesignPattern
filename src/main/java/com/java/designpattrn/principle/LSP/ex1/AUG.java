package main.java.com.java.designpattrn.principle.LSP.ex1;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class AUG extends Rifle {

    public void zoomOut(){
        System.out.println("通过望远镜瞄准敌人");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击");
    }
}
