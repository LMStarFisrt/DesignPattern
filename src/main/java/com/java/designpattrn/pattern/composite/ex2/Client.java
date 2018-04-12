package com.java.designpattrn.pattern.composite.ex2;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        Branch ceo = new Branch("王大麻子", "总经理", 100000);
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        Branch firstDevGroup = new Branch("杨三", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大", "开发二组组长", 6000);

        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);

        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
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

        return ceo;
    }

    public static String getTreeInfo(Branch root) {
        List<ICorp> subordinateList = root.getSubordinate();
        StringBuilder builder = new StringBuilder();
        for (ICorp c : subordinateList) {
            if (c instanceof Leaf) {
                builder = builder.append(c.getInfo()).append("\n");
            } else {
                builder = builder.append(c.getInfo()).append("\n").append(getTreeInfo((Branch) c));
            }
        }
        return builder.toString();
    }
}
