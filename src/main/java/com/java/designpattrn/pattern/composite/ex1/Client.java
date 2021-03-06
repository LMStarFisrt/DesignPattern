package com.java.designpattrn.pattern.composite.ex1;

import com.java.designpattrn.pattern.chain.ex3.Level;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Client {

    public static void main(String[] args) {
        IRoot ceo = new Root("王大麻子", "总经理", 100000);
        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        IBranch firstDevGroup = new Branch("杨三", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大", "开发二组组长", 6000);

        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);

        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);

        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        ceo.add(k);

        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(zhengLaoLiu);

        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);

        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        secondDevGroup.add(g);

        salesDep.add(h);
        salesDep.add(i);

        financeDep.add(j);

        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordonateInfo());

    }

    private static void getAllSubordinateInfo(List subordinateList) {
        int length = subordinateList.size();
        for (int i = 0; i < length; i++) {
            Object o = subordinateList.get(i);
            if (o instanceof Leaf) {
                ILeaf e = (ILeaf) o;
                System.out.println(e.getInfo());
            } else {
                IBranch branch = (IBranch) o;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordonateInfo());
            }
        }
    }
}
