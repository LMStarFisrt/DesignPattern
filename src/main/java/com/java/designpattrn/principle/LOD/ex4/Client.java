package com.java.designpattrn.principle.LOD.ex4;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Client {

    public static void main(String[] args) {
        InstallSoftware software = new InstallSoftware();
        software.installWizard(new Wizard());
    }

}
