package main.java.com.java.designpattrn.principle.LSP.ex1;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Soldier {

    private AbstractGun gun;

    public void setGun(AbstractGun gun){
        this.gun=gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀人...");
        gun.shoot();
    }

}
