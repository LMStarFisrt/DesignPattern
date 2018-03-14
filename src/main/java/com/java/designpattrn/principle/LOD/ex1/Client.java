package com.java.designpattrn.principle.LOD.ex1;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader());
    }
}
