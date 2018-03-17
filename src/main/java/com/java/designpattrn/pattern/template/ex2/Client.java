package com.java.designpattrn.pattern.template.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("-----H1型号悍马-----");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要     1-需要");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HummerH1Model H1 = new HummerH1Model();
        if (type.equals("0")) {
            H1.setAlarm(false);
        }
        H1.run();
        System.out.println("-----H2型号悍马-----");
        HummerH2Model H2 = new HummerH2Model();
        H2.run();
    }

}
