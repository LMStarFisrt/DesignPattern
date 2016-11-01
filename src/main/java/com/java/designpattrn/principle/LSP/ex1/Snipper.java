package main.java.com.java.designpattrn.principle.LSP.ex1;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Snipper extends Soldier{

    public void setGun(AUG gun) {
        super.setGun(gun);
    }

    public void killEnemy (AUG aug){
        aug.zoomOut();
        aug.shoot();
    }

}
