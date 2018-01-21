package com.java.designpattrn.pattern.singleton.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 有上限的多例模式
 * Created by dadisdad on 2016/11/1.
 */
public class Emperor {

    private static int numOfEmp=2;

    private static List<String> nameList=new ArrayList<String>();

    private static List<Emperor> empList=new ArrayList<Emperor>();

    private static int countNum=0;

    private Emperor(){

    }

    private Emperor(String name){
        nameList.add(name);
    }

    static {
        for (int i=0;i<numOfEmp;i++){
            Emperor emperor=new Emperor("皇帝"+(i+1));
            empList.add(emperor);
        }
    }

    public static Emperor getInstance(){
        Random random=new Random();
        countNum=random.nextInt(numOfEmp);
        return empList.get(countNum);
    }

    public void say(){
        System.out.println(nameList.get(countNum));
    }

}
