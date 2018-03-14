package com.java.designpattrn.principle.LOD.ex2;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class GroupLeader {

    private List<Girl> girls;

    GroupLeader(List<Girl> girlList) {
        this.girls = girlList;
    }

    public void countGirls() {
        System.out.println("女生的数量是：" + girls.size());
    }

}
