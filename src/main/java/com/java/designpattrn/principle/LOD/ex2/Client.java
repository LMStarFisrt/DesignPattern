package com.java.designpattrn.principle.LOD.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Client {
    public static void main(String[] args) {
        List<Girl> girls = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }

        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girls));
    }
}
