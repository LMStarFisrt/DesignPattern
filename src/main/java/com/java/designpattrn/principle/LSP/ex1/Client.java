package com.java.designpattrn.principle.LSP.ex1;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Client {

    public static void main(String[] args) {
        Soldier sanMao=new Soldier();

        sanMao.setGun(new MachineGun());
        sanMao.killEnemy();

        Snipper siMao=new Snipper();
        siMao.killEnemy(new AUG());

    }

}
