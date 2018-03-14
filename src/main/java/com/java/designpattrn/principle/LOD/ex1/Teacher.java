package com.java.designpattrn.principle.LOD.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Teacher {

    public void command(GroupLeader leader) {
        List<Girl> girls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }
        leader.countGirls(girls);
    }

}
